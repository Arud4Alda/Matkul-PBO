
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

public class PointOfSales extends JFrame {
    // Data Produk
    private Object[][] Produk = {
        {"P001", "Air Mineral 600ml", 3000},
        {"P002", "Kopi Sachet", 5000},
        {"P003", "Roti isi", 8000},
        {"P004", "Snack Keripik", 6000},
        {"P005", "Minuman Botol", 12000}
    };

    // Komponen GUI
    private JTable tblProduk;
    private DefaultTableModel produkModel;

    private JTable tblKeranjang;
    private DefaultTableModel keranjangModel;

    private JTextField tfQty;
    private JLabel lblSelectedProduk;
    private JLabel lblTotal;
    private JLabel lblPoints;
    private JTextArea txtStruk;

    private JButton btnAdd, btnCheckout, btnPrint;

    private final int POINT_PER_RP = 1000;
    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    public PointOfSales() {
        super("POINT Of-Sales - Java Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        initComponents();
        layoutComponents();
        attachListeners();
        setVisible(true);
    }

    private void initComponents() {
        // Tabel Produk
        String[] prodKol = {"ID", "Nama Produk", "Harga (Rp)"};
        produkModel = new DefaultTableModel(prodKol, 0) {
            public boolean isCellEditable(int row, int column) { return false; }
        };
        for (Object[] p : Produk) produkModel.addRow(p);
        tblProduk = new JTable(produkModel);
        tblProduk.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Tabel Keranjang
        String[] kerKol = {"ID", "Nama Produk", "Qty", "Harga", "Subtotal"};
        keranjangModel = new DefaultTableModel(kerKol, 0) {
            public boolean isCellEditable(int row, int column) { return false; }
        };
        tblKeranjang = new JTable(keranjangModel);
        tblKeranjang.setRowHeight(25);

        // Komponen lainnya
        tfQty = new JTextField("1", 4);
        lblSelectedProduk = new JLabel("Pilih produk dari tabel di kiri");
        lblTotal = new JLabel("Total: Rp 0");
        lblPoints = new JLabel("Point: 0");
        txtStruk = new JTextArea(12, 30);
        txtStruk.setEditable(false);

        btnAdd = new JButton("Add to Cart");
        btnCheckout = new JButton("Checkout");
        btnPrint = new JButton("Cetak");
    }

    private void layoutComponents() {
        // Panel kiri - daftar produk
        JPanel left = new JPanel(new BorderLayout(8, 8));
        left.setBorder(BorderFactory.createTitledBorder("Produk"));
        left.add(new JScrollPane(tblProduk), BorderLayout.CENTER);

        JPanel addPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        addPanel.add(new JLabel("Qty:"));
        addPanel.add(tfQty);
        addPanel.add(btnAdd);

        JPanel topAdd = new JPanel(new BorderLayout());
        topAdd.add(lblSelectedProduk, BorderLayout.CENTER);
        topAdd.add(addPanel, BorderLayout.SOUTH);
        left.add(topAdd, BorderLayout.SOUTH);

        // Panel kanan - keranjang dan ringkasan
        JPanel right = new JPanel(new BorderLayout(8, 8));
        right.setBorder(BorderFactory.createTitledBorder("Keranjang"));

        JScrollPane scrollKeranjang = new JScrollPane(tblKeranjang);
        scrollKeranjang.setPreferredSize(new Dimension(500, 200));

        JPanel summary = new JPanel();
        summary.setLayout(new BoxLayout(summary, BoxLayout.Y_AXIS));
        summary.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        lblTotal.setFont(lblTotal.getFont().deriveFont(Font.BOLD, 16f));
        lblPoints.setFont(lblPoints.getFont().deriveFont(Font.PLAIN, 14f));

        JScrollPane scrollStruk = new JScrollPane(txtStruk);
        scrollStruk.setPreferredSize(new Dimension(500, 150));

        summary.add(lblTotal);
        summary.add(Box.createVerticalStrut(5));
        summary.add(lblPoints);
        summary.add(Box.createVerticalStrut(10));
        summary.add(btnCheckout);
        summary.add(btnPrint);
        summary.add(Box.createVerticalStrut(10));
        summary.add(new JLabel("Struk:"));
        summary.add(scrollStruk);

        right.add(scrollKeranjang, BorderLayout.CENTER);
        right.add(summary, BorderLayout.SOUTH);

        // Gabungkan panel kiri dan kanan
        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, left, right);
        split.setDividerLocation(400);
        add(split, BorderLayout.CENTER);
    }

    private void attachListeners() {
        // Pilih produk dari tabel
        tblProduk.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int row = tblProduk.getSelectedRow();
                if (row >= 0) {
                    String nama = tblProduk.getValueAt(row, 1).toString();
                    lblSelectedProduk.setText("Dipilih: " + nama);
                }
            }
        });

        // Tombol add
        btnAdd.addActionListener(e -> addToCartAction());
        btnCheckout.addActionListener(e -> checkoutAction());
        btnPrint.addActionListener(e -> printReceipt());

        tblProduk.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    tfQty.requestFocus();
                    tfQty.selectAll();
                }
            }
        });
    }

    private void addToCartAction() {
        int prodRow = tblProduk.getSelectedRow();
        if (prodRow < 0) {
            JOptionPane.showMessageDialog(this, "Pilih produk terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int qty;
        try {
            qty = Integer.parseInt(tfQty.getText().trim());
            if (qty <= 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah (integer > 0).", "Input salah", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String id = tblProduk.getValueAt(prodRow, 0).toString();
        String nama = tblProduk.getValueAt(prodRow, 1).toString();
        int harga = Integer.parseInt(tblProduk.getValueAt(prodRow, 2).toString());

        int foundRow = -1;
        for (int i = 0; i < keranjangModel.getRowCount(); i++) {
            if (keranjangModel.getValueAt(i, 0).toString().equals(id)) {
                foundRow = i;
                break;
            }
        }

        if (foundRow >= 0) {
            int existingQty = Integer.parseInt(keranjangModel.getValueAt(foundRow, 2).toString());
            int newQty = existingQty + qty;
            int subtotal = newQty * harga;
            keranjangModel.setValueAt(newQty, foundRow, 2);
            keranjangModel.setValueAt(subtotal, foundRow, 4);
        } else {
            int subtotal = qty * harga;
            keranjangModel.addRow(new Object[]{id, nama, qty, harga, subtotal});
        }

        updateTotals();
    }

    private void updateTotals() {
        int total = 0;
        for (int i = 0; i < keranjangModel.getRowCount(); i++) {
            total += Integer.parseInt(keranjangModel.getValueAt(i, 4).toString());
        }

        lblTotal.setText("Total: " + currencyFormat.format(total));
        int points = total / POINT_PER_RP;
        lblPoints.setText("Point: " + points);
    }

    private void checkoutAction() {
        if (keranjangModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Keranjang kosong.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("======== POINT OFF-SALES =======\n");
        sb.append("Toko: Demo Toko\n");
        sb.append("===============================\n");
        sb.append(String.format("%-5s %-15s %5s %12s\n", "ID", "Nama", "Qty", "Subtotal"));
        sb.append("---------------------------------------------------------\n");

        int total = 0;
        for (int i = 0; i < keranjangModel.getRowCount(); i++) {
            String id = keranjangModel.getValueAt(i, 0).toString();
            String nama = keranjangModel.getValueAt(i, 1).toString();
            int qty = Integer.parseInt(keranjangModel.getValueAt(i, 2).toString());
            int subtotal = Integer.parseInt(keranjangModel.getValueAt(i, 4).toString());
            sb.append(String.format("%-5s %-15s %5d %12s\n", id, nama, qty, currencyFormat.format(subtotal)));
            total += subtotal;
        }

        sb.append("---------------------------------------------------------\n");
        sb.append(String.format("TOTAL: %s\n", currencyFormat.format(total)));
        int points = total / POINT_PER_RP;
        sb.append(String.format("POINTS DAPAT: %d (1 point per Rp %d)\n", points, POINT_PER_RP));
        sb.append("===============================\n");
        sb.append("Terima kasih! Silakan datang kembali.\n");

        txtStruk.setText(sb.toString());
        keranjangModel.setRowCount(0);
        updateTotals();
    }

    private void printReceipt() {
        if (txtStruk.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tidak ada struk untuk dicetak. Silakan checkout terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            boolean printed = txtStruk.print();
            if (printed) {
                JOptionPane.showMessageDialog(this, "Struk berhasil dicetak.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mencetak: " + ex.getMessage(), "Cetak Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PointOfSales::new);
    }
}

