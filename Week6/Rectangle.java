import java.util.Scanner; // have to be to use Scanner class

/**
 * Program take length and width from the user.
 * Count area and perimeter.
 * Check this rectangle is a square or not.
 * Can also run again this program after entering 'yes' when program finish.
 * 
 */
public class Rectangle
{
    double length; // Declare variable
    double width; // Declare variable

    /*
     * 
     */
    public Rectangle(double l, double w)
    {
        length = l; // Declare variable
        width = w;  // Declare variable
    }

    
    /*
     * This method return length of rectangle
     */
    public double getLength() {
        return length; // returns length
    }
    
    /*
     * This method return width of rectangle
     */
    public double getWidth() {
        return width; // returns width
    }
    
    /*
     * This method check the rectangle is also a square
     */
    public boolean isSquare()
    {
        return (length == width); //  check length is equal to width and returns true or false
    }
    
    /*
     * This method count an area of rectangle
     */
    public double getArea() {
        double area = length * width; // multiply length and width
        return area; // returns counted area
    }
    
    /*
     * This method count a perimeter
     */
    public double getPerimeter() {
        return 2 * (length + width); //  returns counted perimeter
    }
    
    /*
     * The main method is need to run program
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //  Declare scanner class to collect the data from the user.
        
        String cont = "yes"; // Declare string, which is need to run loop
        
        /*
         * The following do-while block collect data from the user
         * and check collected data is bigger than 0.
         */
        do {
            /*
             * The next 4 lines collect length and width of rectangle from the user
             */
            System.out.print("Please enter the rectangle length: ");
            double len = keyboard.nextDouble(); // collect length from the user
            System.out.print("Please enter the rectangle width: ");
            double wid = keyboard.nextDouble(); // collect width from the user
            
            /*
             * The if statement and the next 4 lines check collected data from the user is correct
             * and if is correct print length, width, area and perimeter of rectangle. 
             * If length or width less or equal to 0 prints "Sorry you entered a negative value. Please try again.".
             *  and back to start of program reenter length and width.
             *  
             */
            if ((len <= 0) || (wid <= 0)) { // boolean check length and width is bigger less than 0.
                System.out.println("Sorry you entered a negative value. Please try again.\n");
                continue;  // prints "Sorry you entered a negative value. Please try again."
            }
            
            Rectangle myRectangle = new Rectangle(len, wid); // create operator

            //  Prints "The length of the rectangle is (The length of rectagle here)"
            System.out.println("The length of the rectangle is " + myRectangle.getLength()); 
            
            // Prints "The length of the rectangle is (The width of rectagle here)"
            System.out.println("The width of the rectangle is " + myRectangle.getWidth());
            
            // Prints "The length of the rectangle is (The area of rectagle here)"
            System.out.println("The area of the rectangle is " + myRectangle.getArea());
            
            // Prints "The length of the rectangle is (The perimeter of rectagle here)"
            System.out.println("The perimeter of the rectangle is " + myRectangle.getPerimeter());
                        
            boolean isSquare = myRectangle.isSquare(); //  Check rectagle is square or not
            
            /*
             * The following if-else statement check our rectangle is a square  or not.
             */
            if (isSquare) { // if isSquare is true, runs  code below.
                System.out.println("The rectangle is a square."); // Prints "The rectangle is a square."
            }
            else { // if isSquare is false, runs code below.
                System.out.println("The rectangle is no square."); // Prints "The rectangle is no square."
            }
            
            System.out.print("Do you want to continue [yes/no]? "); // Prints "Do you want to continue [yes/no]? "
            cont = keyboard.next(); // Collect answear from the user
            System.out.println(""); // Prints nothing, make blank line
        }
        while (cont.equals("yes")); // loop run again program from begin
        System.out.println("Goodbye!"); // Prints "Goodbye!"
    }
}
