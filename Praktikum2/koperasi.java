import java.util.Scanner;
public class koperasi 
{
    public static void main(String[] args)
    {
        System.out.println("======== Koperasi Mumumeow ========\n");
        System.out.println("===================================\n");
        System.out.println("------------ Dashboard ------------\n\n");
        System.out.println("               Menu\n");
        System.out.println("1. Data Petugas\n");
        System.out.println("2. Data Pelanggan\n");
        System.out.println("3. Data Barang\n");
        System.out.println("4. Pembelian\n");
        System.out.println("5. Data Transaksi\n");
        System.out.println("5. Keluar\n");
        System.out.println("===================================\n");

        System.out.println("Pilih Menu : ");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        sc.close();
    }
}
