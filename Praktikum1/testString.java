import java.util.Scanner;

public class testString 
{
    public static void main(String[] args) 
    {
        //sistem input
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan kata pertama dan kedua:");
        String A = sc.next();
        String B = sc.next();

        // 1. jumlah panjang
        System.out.println("Jumlah semua hurup : ");
        System.out.println(A.length() + B.length());

        // 2. Lexicographical 
        System.out.println("\nApakah kata "+ B + "lebih banyak hurupnya? ");
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        // 3. kapitalisasi
        System.out.println("\nMengkapitalkan hurup pertama kata :");
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);

        sc.close();

        /*
         kata 1 = hello
         kata 2 = java

         output:
         Jumlah semua hurup : 9   
         Apakah kata java lebih banyak hurupnya? No
         Mengkapitalkan hurup pertama kata : Hello Java
        */
    }
}
