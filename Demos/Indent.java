/** Produces a multiplication table using a for loop and -10 - 10 with long.
    Des, 10th November 2000.
*/
import javax.swing.JOptionPane;
public class Indent
{
    public static void main(String [] args) 
    {
        String longString;
        long num = 0, result = 0;
        int loops = 0;
        longString = JOptionPane.showInputDialog("Please enter a number in range +-10");
        num = Long.parseLong(longString);
        if ((num >= -10) && (num <= 10))
        {
            for (loops = 1; loops <= 10; loops++)
            {
                result = num * loops;
                System.out.println("Row number " + loops + "  " + loops + " x " + num + " = " + result);
            }
        }
        else
        {
            System.out.println("Your input number " + num + " is outside the range -10 to 10 inclusive.");
        }
        System.exit(0);     
    }
}
