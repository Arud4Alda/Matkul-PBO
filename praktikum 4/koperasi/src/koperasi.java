import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import id.ac.polban.koperasi.model.*;
import id.ac.polban.koperasi.service.transaksiService;


public class koperasi 
{
    //membuat objek dalam arraylist
    static Scanner sc = new Scanner(System.in);
    static ArrayList<pelanggan> pelangganList = new ArrayList<>();
    static ArrayList<petugas> petugasList = new ArrayList<>();
    static ArrayList<barang> barangList = new ArrayList<>();
    static transaksiService transaksiService = new transaksiService();

    //main class
    public static void main(String[] args) 
    {
        seedData();
        menuUtama();
    }
    //isi data awal
    static void seedData() 
    {
        pelangganList.add(new pelanggan("P01", "Alda"));
        pelangganList.add(new pelanggan("P02", "Aldi"));
        pelangganList.add(new pelanggan("P03", "Aldo"));
        petugasList.add(new petugas("T01", "Budi", "Jakarta", "081234"));
        barangList.add(new ATK("B01", 5000, 10, "Buku Tulis", "Alat Tulis", "Big Boss"));
        barangList.add(new ATK("B02", 10000, 15, "Lanyard", "Aksesoris", "B-Live"));
        barangList.add(new Sembako("S01", 15000, 20, "Minyak Goreng", "Minyak", "Sania"));
        barangList.add(new Sembako("S02", 15000, 30, "Beras", "Bahan Pangan", "Pandan Wangi"));
    }

    //menu utama
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

    //menu untuk menampilkan data pelanggan
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

    //menu untuk menampilkan data petugas
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

    //menu untuk menampilkan data barang
    static void menuInfoBarang() 
    {
        while (true) 
        {
            System.out.println("\n=== INFO BARANG ===");
            for (barang b : barangList) 
            {
                System.out.println(b);
            }
            System.out.println("0. Kembali ke Menu Utama");
            int back = sc.nextInt(); sc.nextLine();
            if (back == 0) return;
        }
    }

    //menu untuk transaksi baru yang akan dibuat
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
            System.out.println("\n=== DAFTAR BARANG ===");
            for (barang b : barangList) 
            {
                System.out.println(b); 
                System.out.println("-------------------");
            }
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
            String idTr = "TRX" + (transaksiService.getSemuaTransaksi().size() + 1);
            String tanggal = java.time.LocalDate.now().toString();

            // kirim objek, bukan String
            transaksi tr = new transaksi(idTr, pt, pl, br, qty, total, tanggal);

            // simpan lewat service
            transaksiService.tambahTransaksi(tr);

            // tampilkan struk
            tr.tampilkanstruk();


            System.out.println("0. Kembali ke Menu Utama");
            int back = sc.nextInt(); sc.nextLine();
            if (back == 0) return;
        }
    }

    //menu untuk menampilkan menu transaksi
    static void menuInfoTransaksi() 
    {
        int pilihan;

        do {
            System.out.println("\n======== MENU TRANSAKSI ========");
            System.out.println("1. Menampilkan Semua Transaksi");
            System.out.println("2. Cari Transaksi berdasarkan ID");
            System.out.println("3. Cari Transaksi berdasarkan Petugas");
            System.out.println("4. Hitung Total Omzet");
            System.out.println("5. Cetak Laporan Transaksi");          
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    for (transaksi tr : transaksiService.getSemuaTransaksi()) 
                    {
                        System.out.println(tr);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan ID Transaksi: ");
                    String id = sc.nextLine();
                    transaksi hasil = transaksiService.cariTransaksi(id);
                    if (hasil != null) {
                        System.out.println(hasil);
                    } else {
                        System.out.println("Transaksi dengan ID " + id + " tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Nama Petugas: ");
                    String namaPetugas = sc.nextLine();
                    List<transaksi> hasilFilter = transaksiService.filterByPetugas(namaPetugas);
                    if (!hasilFilter.isEmpty()) {
                        hasilFilter.forEach(System.out::println);
                    } else {
                        System.out.println("Tidak ada transaksi dengan petugas " + namaPetugas);
                    }                
                    break;
                case 4:
                    System.out.println("Total Omzet: Rp " + transaksiService.hitungTotalOmzet());                    
                    break;
                case 5:
                    System.out.println(transaksiService.exportLaporan());
                    break;
                case 0:
                    menuUtama();
                    break;
            }
        } while (pilihan != 0);
    }
}
