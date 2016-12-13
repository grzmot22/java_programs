import java.util.Scanner;
/*
* Program use Account class,
* collect information about full name
* and address from account holder.
* Rrints collected data.
*
*@author Grzmot22
* @version 28.11.16
*/
public class Input {

	public static void main(String [] args)  {
		Account newClient;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name:");
		String output1 = keyboard.nextLine();
		System.out.println("Enter your address:");
		String output2 = keyboard.nextLine();

		newClient = new Account(100, 100, 0, output1, output2);
		newClient.showAddAndName();
	}
}
