/*
*
*@Edited by Grzmot22
*@version 28.11.16
*/
public class Account{
    private int openingBalance;
    private int currentBalance;
    private int creditLimit;
    private String accountHolderName;
    private String accountHolderAddress;
    // Static variable to store the total number of accounts
    public static int numOfAccounts = 0;

    /**
     * Constructor
     */
    public Account(int startAmount, int balance, int credit, String name, String address)  {       
        openingBalance = startAmount;
        currentBalance = balance;
        creditLimit = credit;
    	accountHolderName = name;
    	accountHolderAddress = address;      
        numOfAccounts++;
    }
    //Fix this void
//    public Account(String name, String address){
//    	accountHolderName = name;
//    	accountHolderAddress = address;
//    }
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
	   System.out.println("name = " + accountHolderName + "\n" + "adrress = " + accountHolderAddress);
   }
    public void showAll()     {
        System.out.println("name = " + accountHolderName + "\n" + "adrress = " + accountHolderAddress);
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
