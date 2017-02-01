import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Program uses Account class,
 *  uses JFrame, shows windows with text fields,
 *   a radio button to choose gender
 *  and  a button to submit.
 *  Create an account.
 * Prints collected data.
 *
 *@author Boguslaw Smolarczyk 1612761
 * @version 09.01.17
 */

public class AccountGUIwithRadio extends JFrame {

    private Container con;
    private String  name;
    private String address = "";
    private String stCredit;
    private String stBalance;
    private int balance;
    private int credit;
    private String gender;
    private JLabel balanceLabel;
    private JLabel creditLabel;
    JLabel nameLabel;
    JLabel addressLabel;
    JLabel rButtonLabel;
    JLabel rText;

    JTextField balanceText;
    JTextField creditText;
    JTextField nameText;
    JTextField addressText;
    JButton submitButton;
    /**
     * Constructor to set up things
     */
    public AccountGUIwithRadio(){

        /*
		 * Create window, get content pane
		 */
        super("Create an Account");
        con = getContentPane();

        ButtonGroup buttonGroup = new ButtonGroup();
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
        rButtonLabel = new JLabel("Choose one:");
        rText = new JLabel("");
        balanceText.setToolTipText("Balance");
        creditText.setToolTipText("Credit");
        nameText.setToolTipText("Name");
        addressText.setToolTipText("Address");

        // 'Male' button
        JRadioButton mButton = new JRadioButton("Male");
        mButton.setActionCommand("male");

        // 'Female' Button
        JRadioButton fButton = new JRadioButton("Female");
        fButton.setActionCommand("female");

        // Add radio buttons to the button group
        buttonGroup.add(mButton);
        buttonGroup.add(fButton);

        /*
		 * Sets the layout
		 */
        FlowLayout myLayout = new FlowLayout();
        con.setLayout(myLayout);

        /*
		 * Add all created GUI elements to our content pane
		 */
        con.add(nameLabel);
        con.add(nameText);
        con.add(addressLabel);
        con.add(addressText);
        con.add(rButtonLabel);
        con.add(fButton);
        con.add(mButton);
        con.add(rText);
        con.add(balanceLabel);
        con.add(balanceText);
        con.add(creditLabel);
        con.add(creditText);
        con.add(submitButton);

        submitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                name = nameText.getText();
                address = addressText.getText();
                stBalance = balanceText.getText();
//                Account acc = new Account(Integer.parseInt(balanceText.getText()),Integer.parseInt(creditText.getText()),gender,name,address);
                JOptionPane.showMessageDialog(AccountGUIwithRadio.this,
                        "Account has been created\n");
//                acc.showAll();
                System.out.println(Account.numOfAccounts+" accounts opened");

            }
        });
        mButton.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent e) {
                                          // we use some information from the ActionEvent object
                                          rText.setText("You are: " + e.getActionCommand() + "!");
                                          gender = e.getActionCommand();
                                      }
                                  }
        );
        fButton.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent e) {
                                          // we use some information from the ActionEvent object
                                          rText.setText("You are: " + e.getActionCommand() + "!");
                                          gender = e.getActionCommand();
                                      }
                                  }
        );
        /*
		 * Do some required layout stuff, tell Java to exit when we press the Close button
		 */
        pack();
        setLocation(210,150);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String [] args)
    {
        AccountGUIwithRadio newAccount = new AccountGUIwithRadio();

    }
}
