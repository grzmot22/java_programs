import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Program uses Account1 class,
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
    
    private String name = "";
    private String address = "";
    private String stBalance = "";
    private String gender;
    
    private JLabel balanceLabel;
    private JLabel creditLabel;
    private JLabel nameLabel;
    private JLabel addressLabel;
    private JLabel rButtonLabel;
    private JLabel rText;
    private JLabel error;
    
    private JTextField balanceText;
    private JTextField creditText;
    private JTextField nameText;
    private JTextField addressText;
    
    private JButton saveButton;
    private JButton submitButton;
    private JButton loadButton;
    
    private PrintWriter myWriter;
    private BufferedReader myReader;
   
    
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
        saveButton = new JButton("Save");
        submitButton = new JButton("Submit");
        loadButton = new JButton("Load");
        rButtonLabel = new JLabel("Choose one:");
        rText = new JLabel("");
        balanceText.setToolTipText("Balance");
        creditText.setToolTipText("Credit");
        nameText.setToolTipText("Name");
        addressText.setToolTipText("Address");
        error = new JLabel("");

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
        con.add(saveButton);
        con.add(loadButton);
        con.add(submitButton);
        con.add(error);

        
        
        
        submitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                name = nameText.getText();
                address = addressText.getText();
                stBalance = balanceText.getText();
                Account acc = new Account(Integer.parseInt(balanceText.getText()),Integer.parseInt(creditText.getText()),gender,name,address);
                JOptionPane.showMessageDialog(AccountGUIwithRadio.this,
                        "Account has been created\n");
                acc.showAll();
                System.out.println(Account1.numOfAccounts+" accounts opened");

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

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           	 
           	    try {
					myWriter = new PrintWriter("Account.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
           	    
                myWriter.println(nameText.getText());
                myWriter.println(addressText.getText());
                myWriter.println(balanceText.getText());
                myWriter.println(creditText.getText());
                myWriter.println(gender);
                myWriter.close();
            }
        }
        );
        
        loadButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                	myReader = new BufferedReader(new FileReader("Account.txt"));

                    nameText.setText(myReader.readLine());
                    addressText.setText(myReader.readLine());
                    balanceText.setText(myReader.readLine());
                    creditText.setText(myReader.readLine());
                    gender = myReader.readLine();
                    if (gender  == "male") {
                        mButton.setSelected(true);
                        gender = "male";
                        rText.setText("You are: " + gender + "!");
                    }
                    else if (gender == "female"){
                        fButton.setSelected(true);
                        gender = "female";
                        rText.setText("You are: " + gender + "!");

                    }
                    creditText.setText(myReader.readLine());
                    gender = myReader.readLine();
                    myReader.close();

                }
                catch (IOException ie)
                {
                    error.setText(ie.toString());
                }
            }
        });
        

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
        AccountGUIwithRadio newAccount = new Accou