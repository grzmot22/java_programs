/*
* Program use Account class,
* create 3 accounts.
* Prints collected data.
*
*@author Grzmot22
* @version 28.11.16
*/
public class Create3Accounts {

    public static void main(String [] args) {
        Account account1, account2, account3;
                account1 = new Account(500, 300, 200, "Stefan Kennedy", "12 London Road, Manchester");
                account1.showAll();
        System.out.println(Account.numOfAccounts+" accounts opened");
        account2 = new Account(1500, 1300, 1200, "Stefan Kennedy", "45 Park Road, London");
                account2.showAll();
        System.out.println(Account.numOfAccounts+" accounts opened");

        account3 = new Account(3500, 4300, 5200, "Stefan Kennedy", "124 Cardiff Road, Luton");
                account3.showAll();
        System.out.println(Account.numOfAccounts+" accounts opened");

    }
    }
