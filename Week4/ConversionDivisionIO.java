import java.util.Scanner;

/**
 * The program  read in the number of square metres from the keyboard and convert the input from
 *square metres into square kilometres. Display the results using
 *System.out.println() and then System.out.printf().
 * 
 * @author Grzmot22
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
