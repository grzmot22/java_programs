import java.util.Scanner;

/**
 * The program to input one integer, multiply its value by 2 and output the result.
 * 
 * @author Grzmot22
 * @version 24.10.16
 */

public class KeyboardIO {
	
	public KeyboardIO()
	{
		int n1, n2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type number ");
		n1 = keyboard.nextInt(); //Collect number from user
		n2 = n1 * 2; //multiply this number by 2
		System.out.println("Your number multiplied  by 2 is " +n2); // Print the result
	}

}
