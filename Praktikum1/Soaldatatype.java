import java.util.Scanner;
public class Soaldatatype 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("===== Uji coba tipe data =====\n\n");
        System.out.print("Masukkan jumlah uji coba: ");
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.print("\nMasukkan bilangan: ");
            String m = sc.nextLine();
            try {
                long n = Long.parseLong(m); // coba parsing ke long
                System.out.println(n + "can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // pasti muat di long karena berhasil parse
                System.out.println("* long");

            } catch (NumberFormatException e) {
                // kalau angka terlalu besar untuk long
                System.out.println(m + " can't be fitted anywhere.");
            }
        }
        
        sc.close();

    }
}
