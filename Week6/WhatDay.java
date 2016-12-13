/*
* Program collect munbers from the user.
* If the user enter number between 1 and 7, program shows day of week.
*
*
*@author Boguslaw Smolarczyk 1612761
* @version 7.11.16
*/
import java.util.Scanner;

public class WhatDay {
	public WhatDay() {
		int input;
		Scanner in = new Scanner(System.in);
		String cont = "yes";
		do {
        System.out.println("Enter number between 1 and 7:");		
		input = in.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Monday");
                }
                break;
                case 2: {
                    System.out.println("Tuesday");
                }
                break;
                case 3: {
                    System.out.println("Wednesday");
                }
                break;
                case 4: {
                    System.out.println("Thursday");
                }
                break;
                case 5: {
                    System.out.println("Friday");
                }
                break;
                case 6: {
                    System.out.println("Saturday");
                }
                break;
                case 7: {
                    System.out.println("Sunday");
                }
                break;
                default: {
                    System.out.println("You entered over range! ");
                }
            }
            System.out.print("Do you want to try again [yes/no]? "); 
            cont = in.next(); // ...
            System.out.println("");
		}
		while (cont.equals("yes")); 
	    
		System.out.println("Goodbye!");
	}
}
