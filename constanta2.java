public class constanta2 
{
    public static final double CM_PER_INCH = 2.54; 
    public static void main(String[] args) 
    { 
        double paperWidth = 8.5; 
        double paperHeight = 11; 
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH); 
        // hasilnya sama dengan constanta : Paper size in centimeters: 21.59 by 27.94
        /*
           Perbedaan deklarasi konstanta:
           final double = konstanta lokal yang hanya bisa diakses di dalam method tempatnya didefinisikan.
           public static final double = konstanta class-level yang bersifat global dan dapat diakses dari mana saja menggunakan NamaClass.NAMA_KONSTANTA.
        */
    } 
}
