import java.util.Scanner;

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
