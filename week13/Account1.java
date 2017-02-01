
/**
 * Account1 Class
 * 
 * Sue Brandreth
 * 10/01/2016
 */

public class Account1 {
    private double openingBalance = 0;
    private double currentBalance;
    private double creditLimit;
    private String accountHoldersName;//new instance variable to hold account holder's name
    private String accountHoldersAddress;//new instance variable to hold account holder's address
    private String gender;

    // Static variable to store the total number of accounts
    public static int numOfAccounts = 0;

    /**
     * Constructor to initialise class (with new arguments for name and address)
     */
    public Account1(String name, String address, String sex, double balance, double credit)  {
        accountHoldersName = name;//uses name value to initialise account holder's name
        accountHoldersAddress = address;//uses address value to initialise account holder's address
        gender = sex;//uses sex value to initialise the gender
        currentBalance = balance;//uses the balance value to initialise current balance
        creditLimit = credit;//uses credit value to initialise credit limit
        openingBalance += currentBalance; //set opening balance to currentBalance value
        
        numOfAccounts++;//increments numOfAccount variable by 1 for every instance of class account created
    }
    
    
    /**
     * Set the balance
     */
    public void setBalance( double amount)  {
        currentBalance = amount;//sets the current balance value to whatever amount is
    }

    /**
     * Get the balance
     */
    public double getBalance()   {
        return currentBalance;//returns the value of current balance when called
    }

    /**
     * Set the credit limit
     */
    public void setCreditLimit(double amount) {
        creditLimit = amount; //sets the credit limit to whatever amount is
    }

    /**
     * Get the credit limit
     */
    public double getCreditLimit()   {
        return creditLimit; //returns the value of credit limit when called
    }
    
    /**
     * Set account holders name
     */
    public void setName (String name)
    {
        accountHoldersName = name; //sets the account holder name to whatever name is
    }
    
    /**
     * Get the account holders name
     */
    public String getName(){
        return accountHoldersName; //returns the value stored in account holders name when called
    }
    
    /**
     * Set account holders address
     */
    public void setAddress (String address){
        accountHoldersAddress = address; //sets the account holders address to whatever address is
    }
    
    /**
     * Get account holders address
     */
    public String getAddress(){
        return accountHoldersAddress; //returns the value in account holders address when called
    }
   

    /**
     * Show the current balance and the credit limit
     */ 
    public void showBalanceAndCredit()     {
        //prints the value stored in current balance and credit as strings to screen
        System.out.println("is "+gender+",\nand has an Account1 balance of " + currentBalance + " and a credit of " + creditLimit +"\n");
    }
    
    /**
     * Get number of accounts created
     */
    public static int getNumOfAccounts(){
        return numOfAccounts;
    }
}

