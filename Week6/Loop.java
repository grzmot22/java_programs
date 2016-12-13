/*
* Program show how the loop works.
*
*@author Boguslaw Smolarczyk 1612761
* @version 7.11.16
*/

import java.util.Scanner;

public class Loop {
	public Loop(){

		char input;
		char input1;
		Scanner keyboard = new Scanner(System.in);
		
		String cont = "yes";
		do {
		System.out.println("Type Y to start loop: ");
		input = keyboard.next().charAt(0);
		
			if(input == 'Y')
			{

				System.out.println("Enter N to stop loop");
			do
			{
				input1 = keyboard.next().charAt(0);
			}
			while(input1 != 'N');
			System.out.println("You typed 'N' \nLoop has been stopped");
			}
        System.out.print("Do you want to run the program again [yes/no]? ");
        cont = keyboard.next();
        System.out.println("");
		}
		while (cont.equals("yes"));
    
		System.out.println("Goodbye!");
	}
}
