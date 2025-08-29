import java.util.ArrayList;
import java.util.Scanner;

public class koperasi 
{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<pelanggan> pelangganList = new ArrayList<>();
    static ArrayList<petugas> petugasList = new ArrayList<>();
    static ArrayList<barang> barangList = new ArrayList<>();
    static ArrayList<transaksi> transaksiList = new ArrayList<>();

    public static void main(String[] args) 
    {
        seedData();
        menuUtama();
    }

    static void seedData() 
    {
        pelangganList.add(new pelanggan("P01", "Alda"));
        petugasList.add(new petugas("T01", "Budi", "Jakarta", "081234"));
        barangList.add(new barang("B01", "Buku Tulis", "ATK", 5000, 10));
        barangList.add(new barang("B02", "Pulpen", "ATK", 3000, 15));
    }

    static void menuUtama() 
    {
        while (true) 
        {
            System.out.println("\n======== Koperasi Mumumeow ========");
            System.out.println("------------ Dashboard ------------");
            System.out.println("1. Data Petugas");
            System.out.println("2. Data Pelanggan");
            System.out.println("3. Data Barang");
            System.out.println("4. Pembelian");
            System.out.println("5. Data Transaksi");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu : ");

            int menu = sc.nextInt();
            sc.nextLine(); // consume enter

            switch (menu) 
            {
                case 1 -> menuInfoPetugas();
                case 2 -> menuInfoPelanggan();
                case 3 -> menuInfoBarang();
                case 4 -> menuTransaksiBaru();
                case 5 -> menuInfoTransaksi();
                case 6 -> { System.out.println("Terima kasih!"); return; }
                default -> System.out.println("Pilihan salah!");
            }
        }
    }

    static void menuInfoPelanggan() 
    {
        while (true) 
        {
            System.out.println("\n=== INFO PELANGGAN ===");
            for (pelanggan p : pelangganList) 
            {
                p.tampilkanpelanggan();
            }
            System.out.println("0. Kembali ke Menu Utama");
            int back = sc.nextInt(); sc.nextLine();
            if (back == 0) return;
        }
    }

    static void menuInfoPetugas() 
    {
        while (true) 
        {
            System.out.println("\n=== INFO PETUGAS ===");
            for (petugas t : petugasList) 
            {
                t.tammpilkanpetugas();
            }
            System.out.println("0. Kembali ke Menu Utama");
            int back = sc.nextInt(); sc.nextLine();
            if (back == 0) return;
        }
    }

    static void menuInfoBarang() 
    {
        while (true) 
        {
            System.out.println("\n=== INFO BARANG ===");
            for (barang b : barangList) 
            {
                b.tampilkanbarang();
            }
            System.out.println("0. Kembali ke Menu Utama");
            int back = sc.nextInt(); sc.nextLine();
            if (back == 0) return;
        }
    }

    static void menuTransaksiBaru() 
    {
        while (true) 
        {
            System.out.println("\n=== TRANSAKSI BARU ===");
            System.out.print("Nama Pelanggan: ");
            String nama = sc.nextLine();
            pelanggan pl = new pelanggan("P" + (pelangganList.size() + 1), nama);
            pelangganList.add(pl);

            petugas pt = petugasList.get(0); // sementara pilih petugas pertama

            menuInfoBarang();
            System.out.print("Pilih ID Barang: ");
            String idb = sc.nextLine();

            barang br = null;
            for (barang b : barangList) 
            {
                if (b.getidbarang().equalsIgnoreCase(idb)) 
                {
                    br = b;
                    break;
                }
            }

            if (br == null) 
            {
                System.out.println("Barang tidak ditemukan!");
                return;
            }

            System.out.print("Jumlah beli: ");
            int qty = sc.nextInt();
            sc.nextLine();

            if (qty > br.getstok()) 
            {
                System.out.println("⚠ Stok tidak cukup!");
                return;
            }

            br.kurangistok(qty);
            int total = br.getharga() * qty;
            String idTr = "TRX" + (transaksiList.size() + 1);
            String tanggal = java.time.LocalDate.now().toString();
            transaksi tr = new transaksi( idTr, pt.getnamaptgs(), pl.getnamaplgn(), br.getnamabrg(), qty, total, tanggal);
            transaksiList.add(tr);
            tr.tampilkanstruk();

            System.out.println("0. Kembali ke Menu Utama");
            int back = sc.nextInt(); sc.nextLine();
            if (back == 0) return;
        }
    }

    static void menuInfoTransaksi() 
    {
        while (true) 
        {
            System.out.println("\n=== RIWAYAT TRANSAKSI ===");
            for (transaksi t : transaksiList) {
                t.tampilkanstruk();
            }
            System.out.println("0. Kembali ke Menu Utama");
            int back = sc.nextInt(); sc.nextLine();
            if (back == 0) return;
        }
    }
}
