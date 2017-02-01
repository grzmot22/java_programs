// import needed library to work gui
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

/**
 * Program uses Account class,
 *  uses JFrame, shows windows with text fields
 *  and  a button to submit.
 *  Create an account.
 * Prints collected data.
 *
 *@author Boguslaw Smolarczyk 1612761
 * @version 02.01.17
 */

public class AccountGUI extends JFrame { // expand my class with JFrame class
    /**
     Declare all need strings, labels, text fields and button.
     */
    private Container con; //Declare container
    private String  name; // Declare string
    private String address = ""; // Declare string
    private JLabel balanceLabel;// Declare JLabel
    private JLabel creditLabel;// Declare JLabel
    private JLabel nameLabel;// Declare JLabel
    private JLabel addressLabel;// Declare JLabel
    private JTextField balanceText;// Declare JTextField
    private JTextField creditText;// Declare JTextField
    private JTextField nameText;// Declare JTextField
    private JTextField addressText;// Declare JTextField
    private JButton submitButton;// Declare JButton
    /**
     * Constructor to set up things
     */
    public AccountGUI(){

        /**
         * Create window, get content pane
         */
        super("Create an Account");
        con = getContentPane();
        /*
		 * Labels and buttons and text fields
		 */
        balanceLabel = new JLabel("Please enter balance:");
        creditLabel = new JLabel("Please enter credit:");
        nameLabel = new JLabel("Please enter name:");
        addressLabel = new JLabel("Please enter address:");
        balanceText = new JTextField("", 20);
        creditText = new JTextField("", 20);
        nameText = new JTextField("", 20);
        addressText = new JTextField("", 20);
        submitButton = new JButton("Submit");

        /**
         When you when you move the mouse over text field, you see a tip.
         */
        balanceText.setToolTipText("Balance"); //set tip text to the balance text field
        creditText.setToolTipText("Credit"); //set tip text to the credit text field
        nameText.setToolTipText("Name"); //set tip text to the name text field
        addressText.setToolTipText("Address"); //set tip text to the address text field

        /**
         * Sets the layout
         */
        FlowLayout myLayout = new FlowLayout();
        con.setLayout(myLayout);

        /*
		 * Add all created GUI elements to our content pane.
		 */
        con.add(nameLabel); // add the name label to container
        con.add(nameText); // add the name text field to container
        con.add(addressLabel); // add the address label to container
        con.add(addressText); // add the address text field  to container
        con.add(balanceLabel); // add the balance label to container
        con.add(balanceText); // add the balance text field  to container
        con.add(creditLabel); // add the credit label to container
        con.add(creditText); // add the credit text field  to container
        con.add(submitButton); // add the submit button to container

        /**
         * Create new listener to the submit button.
         * When you click on the submit button the program will run code inside.
         * When you click on the submit button will create an account.
         */
        submitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                name = nameText.getText();// read the name from text field
                address = addressText.getText();// read the address from text field
                // create new account class named acc also read and convert to integer the balance and the credit from the text fields
                Account acc = new Account(Integer.parseInt(balanceText.getText()),Integer.parseInt(creditText.getText()),name,address);
                JOptionPane.showMessageDialog(AccountGUI.this,
                        "Account has been created\n");// This is a popup window, which show after click on the submit button
                acc.showAll(); // run method from the account class, which print in the console all collected data from the user
                System.out.println(Account.numOfAccounts+" accounts opened"); // print how many we opened accounts

            }
        });

        /*
		 *
		 * Tell Java to exit when we press the Close button,
		 * set windows size 400x300px and where open the window.
		 */
        setLocation(510,200); // Set location, where window will be open.
        setSize(400, 300); // setup the window size: width: 400px, height: 300px
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     *In main class I run the program.
     */
    public static void main(String [] args)
    {
        AccountGUI newAccount = new AccountGUI(); //run the program
    }
}
