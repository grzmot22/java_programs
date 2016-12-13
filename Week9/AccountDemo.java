import java.util.Scanner;

/**
 * Orchestration class for Account
 */
public class AccountDemo   
{
	
    public static void main(String [] args)  {
        Account maryAccount, johnAccount;
   		Scanner keyboard = new Scanner(System.in);
   		System.out.println("Enter your name:");
   		String output1 = keyboard.nextLine();
   		System.out.println("Enter your address:");
   		String output2 = keyboard.nextLine();
        johnAccount = new Account(1000, 1000, 100, output1, output2);
        System.out.print("John's ");
        johnAccount.showData();
//        johnAccount.getAddress();
//        johnAccount.getName();
        System.out.println(Account.numOfAccounts+" accounts opened");

        maryAccount = new Account(2000, 2000, 200, output1, output2);   
        System.out.print("Mary's ");
        maryAccount.showData();
        System.out.println(Account.numOfAccounts+" accounts opened");

        maryAccount = johnAccount; //assigning maryAccount to johnAccount
        System.out.print("John's ");
        johnAccount.showData();
        System.out.print("Mary's ");
        maryAccount.showData();
        
        System.out.println(Account.numOfAccounts+" accounts opened");

    }

}
