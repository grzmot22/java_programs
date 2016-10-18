/*
 * Small program to demonstrate the usage of constants in Java
 * 
 * 
 */
public class PIDemo {
    // Define PI as a constant. Note that you need to do it outside the
    // main class.
    public static final double PI = 3.14159;
    
    /*
     * The main method
     */
    public static void main (String[] args) {
        // diameter is a double variable that is initialised with 4.0
        double diameter = 6.0;
        
        // circumference is defined as the product of diameter and PI
        double circumference = diameter * PI;
        System.out.println("Circumference 1 is " + circumference);
        
        diameter = 2.0; // a new value for diameter
        circumference = diameter * PI; // a new value for circumference
        System.out.println("Circumference 2 is " + circumference);
    }
}
