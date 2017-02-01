/*
*
*@Edited by Boguslaw Smolarczyk 1612761
*@version 09.01.17
*/
public class Account{
    private int openingBalance; // declare opening balance variable
    private int currentBalance; // declare current balance variable
    private int creditLimit;    // declare credit limit variable
    private String accountHolderName; // declare string of the account holder name
    private String accountHolderAddress;    // declare string of the account holder address
    private String gender;
    // Static variable to store the total number of accounts
    public static int numOfAccounts = 0;

    /**
     * Constructor
     *
     */
    public Account(int startAmount, int balance, int credit, String name, String address)  {
        openingBalance = startAmount;
        currentBalance = balance;
        creditLimit = credit;
        accountHolderName = name;
        accountHolderAddress = address;
        numOfAccounts++;
    }
    /**
     * Constructor
     */
    public Account( int balance, int credit ,String name, String address)  {
        currentBalance = balance;
        creditLimit = credit;
        accountHolderName = name;
        accountHolderAddress = address;
        numOfAccounts++;
    }
    /**
     * Set the balance
     */
    public void setBalance( int amount)  {
        currentBalance = amount;
    }

    /**
     * Get the balance
     */
    public int getBalance()   {
        return currentBalance;
    }

    /**
     * Set the credit limit
     */
    public void setCreditLimit(int amount) {
        creditLimit = amount;
    }

    /**
     * Get the credit limit
     */
    public int getCreditLimit()   {
        return creditLimit;
    }

    /**
     * Show the current balance and the credit limit
     */
    public void showData()     {
        System.out.println("balance = " + currentBalance + " credit = " + creditLimit);
    }
    public void showAddAndName() {
        System.out.println("name = " + accountHolderName + "\n" + "address = " + accountHolderAddress);
    }

    /**
     * Show the account holder name, the address of account's holder, the current balance and the credit limit
     */
    public void showAll()     {
        System.out.println("name = " + accountHolderName + "\n" + "address = " + accountHolderAddress);
        System.out.println("balance = " + currentBalance + " credit = " + creditLimit);
    }
    /**
     * Set the account's holder name
     */
    public void setName(String name){

        accountHolderName = name;
    }
    /**
     * Get the account's holder name
     */
    public String getName() {
        return accountHolderName;
    }
    /**
     * Set the account's holder address
     */
    public void setAddress(String address){
        accountHolderAddress = address;
    }
    /**
     * Get the account's holder address
     */
    public String getAddress() {
        return accountHolderAddress;
    }

}


