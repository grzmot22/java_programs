import java.util.Scanner;

/**
 * The program read 3 doubles from the keyboard and calculate the average marks from
 *the three marks.  
 * @author Boguslaw Smolarczyk 1612761 
 * @version 24.10.16
 */

public class MarkAverageIO {
	public MarkAverageIO()
	{
		Scanner keyboard = new Scanner(System.in);
		
		double mark1, mark2, mark3, average;
		
		System.out.println("Type first mark: " );
		mark1 = keyboard.nextDouble();
		System.out.println("Type second mark: " );
		mark2 = keyboard.nextDouble();
		System.out.println("Type third mark: " );
		mark3 = keyboard.nextDouble();
		average = (mark1 + mark2 + mark3)/3;
		System.out.println("The average from " + mark1 + " "  + mark2 + " " + mark3 + " is equal to " + average );
	}

}
