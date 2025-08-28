public class convertDataType 
{
    static short methodOne(long l) 
    { 
        int i = (int) l; 
        return (short)i; 
    } 
    public static void main(String[] args) 
    { 
        double d = 10.25; 
        float f = (float) d; 
        byte b = (byte) methodOne((long) f); 
        System.out.println(b); 
        /*
         1. nilai b adalah 10
         2. d = 10.25 
            saat di-cast ke float  = 10.25.        
            lalu ke long = 10.        
            lalu ke int = 10.        
            lalu ke short = 10.        
            akhirnya ke byte = 10.
        */
    }
}
