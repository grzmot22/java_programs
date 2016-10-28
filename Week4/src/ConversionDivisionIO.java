import java.util.Scanner;

/**
 * The program read 3 doubles from the keyboard and calculate the average marks from
 *the three marks.
 * 
 * @author Boguslaw Smolarczyk 1612761 
 * @version 24.10.16
 */

public class ConversionDivisionIO {

	public ConversionDivisionIO()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type square meters: ");
		double meter = keyboard.nextDouble();
		double million = 1000000;
		double kilometre = meter / million;
		String output = "square meters into square kilometres are ";
		System.out.println(output + kilometre);
		
	}
	
}
