public class constanta 
{
    public static void main(String[] args) 
    { 
        final double CM_PER_INCH = 2.54; 
        double paperWidth = 8.5; 
        double paperHeight = 11; 
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH); 
        // hasilnya sama dengan constanta2 : Paper size in centimeters: 21.59 by 27.94
        /*
           Perbedaan deklarasi konstanta:
           final double = konstanta lokal yang hanya bisa diakses di dalam method tempatnya didefinisikan.
           public static final double = konstanta class-level yang bersifat global dan dapat diakses dari mana saja menggunakan NamaClass.NAMA_KONSTANTA.
        */
    } 
}
