public class floatingPoint 
{
    public static void main(String[] args) 
    { 
        double x = 92.98; 
        int nx = (int) Math.round(x);
        System.out.println("x = " + x);
        System.out.println("nx = " + nx); 
        /*1. Nilai nx = 93 (karena 92.98 dibulatkan jadi 93).
          2. Math.round(x) untuk membulatkan nilai variabel 
        */
    } 
}
