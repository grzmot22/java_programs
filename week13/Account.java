/*
*
*@Edited by Boguslaw Smolarczyk 1612761
*@version 09.01.17
*/
public class Account{
    private int openingBalance;
    private int currentBalance;
    private int creditLimit;
    private String accountHolderName;
    private String accountHolderAddress;
    private String gender;
    // Static variable to store the total number of accounts
    public static int numOfAccounts = 0;
    /**
     * Constructor
     */
    public Account(int startAmount, int balance, int credit, String name, String address) {
        openingBalance = startAmount;
        currentBalance = balance;
        creditLimit = credit;
        accountHolderName = name;
        accountHolderAddress = address;
        numOfAccounts++;
    }
    public Account( int balance, int credit,String gen ,String name, String address) {
        currentBalance = balance;
        creditLimit = credit;
        gender = gen;
        accountHolderName = name;
        accountHolderAddress = address;
        numOfAccounts++;
    }
    /**
     * Set the balance
     */
    public void setBalance( int amount) {
        currentBalance = amount;
    }
    /**
     * Get the balance
     */
    public int getBalance() {
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
    public int getCreditLimit() {
        return creditLimit;
    }
    /**
     * Show the current balance and the credit limit
     */
    public void showData() {
        System.out.println("balance = " + currentBalance + " credit = " + creditLimit);
    }
    public void showAddAndName() {
        System.out.println("name = " + accountHolderName + "\n" + "address =" + accountHolderAddress);
    }
    public void showAll() {
        System.out.println("name = " + accountHolderName + "\n" + "address =" + accountHolderAddress + "\n" + "gender = "+gender);
        System.out.println("balance = " + currentBalance + " credit = " + creditLimit);
    }
    public void setName(String name){
        accountHolderName = name;
    }
    public String getName() {
        return accountHolderName;
    }
    public void setAddress(String address){
        accountHolderAddress = address;
    }
    public String getAddress() {
        return accountHolderAddress;
    }
}