package throwingexceptions;

/**
 *
 * @author GemintangSangkajiFurqon
 */
// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------

    public static int factorial(int n) throws IllegalArgumentException {
        int fac = 1;        
        if ( n < -1 ){
            throw new IllegalArgumentException("Factorial can't be negative");
        }
        else if ( n > 16 ){
            throw new IllegalArgumentException("Overflow");
        }                    
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}