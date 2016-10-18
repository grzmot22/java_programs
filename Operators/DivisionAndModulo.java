/**
 * Division and modulo demo
 * 
 * Ingo, 15.10.2012
 * 
 */
public class DivisionAndModulo
{
    
    /**
     * The main method
     */
    public static void main(String[] args)
    {
      
        /*
         * Integer division
         */
        int i1 = 5;
        int i2 = 2;
        System.out.println("Integer division: " + i1 + "/" + i2 + " = " + i1/i2);
        
        /*
         * Double division
         */
        double d1 = 5;
        double d2 = 2;
        System.out.println("This is how we know it: " + d1 + "/" + d2 + " = " + d1/d2);
        
        /*
         * Modulo
         */
        System.out.println(""); // empty line
        System.out.println("Modulo example:");
        System.out.println("Modulo (integer): " + i1 + "%" + i2 + " = " + i1%i2);
        System.out.println("Modulo (double): " + d1 + "%" + d2 + " = " + d1%d2);
        
        
    }
    
 
}

