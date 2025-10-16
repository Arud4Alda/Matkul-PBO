// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class Mathutils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException
    {
        if (n < 0) {
            throw new IllegalArgumentException("Terdapat angka negatif: " + n);
        }
        if (n > 16) {
            throw new IllegalArgumentException("Angka terlalu besar (overflow): " + n + " pillih angka < 17");
        }
        int fac = 1;
        for (int i=n; i>0; i--)
        fac *= i;
        return fac;
    }
}
