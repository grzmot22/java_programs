/*
 *author Grzmot22 17/10/16 
 *
 */
public class SecretClass {

// Define constant
static final double PI = 3.141592653589793;

/*
 * The purpose of the main() method is  the most important thing in java without main() program *don’t run
 */
public static void main(String args[]) {
    
    // prints text Java is cool!
    System.out.println("Java is cool!");
    
    // prints sum of 2+3, print number 5
    System.out.println(2 + 3);
    
    // This prints 2 and sums 2 +2 and that is 4 but dont have space so pirnt 24
    System.out.println("2" + (2 + 2));
    
    /*
     *  Define string "PI = " and print PI = 3.141592653589793
     */
    String str = "PI = ";
    System.out.println(str + PI);
    
    // muliple PI by PI (square of PI)
    double piSquare = PI * PI;
    
    // This line print The square of is 9.8596..... 
    System.out.println("The square of PI is " + piSquare);
    
    // define fakePI by divide square of PI by 2
    double fakePI = piSquare/2;
    
    // check PI is equal to fake PI
    boolean checkPI = (PI == fakePI);
    
    // This lines print PI and the fake PI are equal. This statement is false.
    System.out.println("PI and the fake PI are equal. " +
                " This statement is " + checkPI + ".");
    
                
    /*
     * Define new value of fakePI and checkPI.
	 * Print PI and the fake PI are equal.  Now this statement is true.
     */
    fakePI = 3.141592653589793;
    checkPI = (PI == fakePI);
    System.out.println("PI and the fake PI are equal. " +
                " Now this statement is " + checkPI + ".");
                
    // check  Mehmet equals Herb. Print false.
    System.out.println("Mehmet".equals("Herb"));
}


}
