import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ada on 2017-01-30.
 */
public class DemoHolidayGUI extends JFrame
{
    private Container con;
//    private String startDate;
//    private String endDate;
//    private String place;
//    private double price;
    private JLabel startDateLabel;
    private JLabel endDateLabel;
    private JLabel placeLabel;
    private JLabel priceLabel;
    private JTextField startDateText;
    private JTextField endDateText;
    private JTextField placeText;
    private JTextField priceText;
    private JButton subButton1;
    private JButton subButton2;
    private JButton compareButton;
    Holiday hol1,hol2;
    
//	public boolean equals(Holiday hol2) {
// 		if (hol1.getStartDate().equals(hol2.getStartDate()) 
// 		&& hol1.getEndDate().equals(hol2.getEndDate())
// 		&& hol1.getPlace().equals(hol2.getPlace()) 
// 		&& hol1.getPrice() == hol2.getPrice())  
// 		{
// 			System.out.println("Object states are equal");
// 			return true;
// 		}
// 		else  {
// 			System.out.println("Object states are NOT equal");
// 			return false;
// 		}
//	}
    DemoHolidayGUI(){
        /*
       * Create window, get content pane
       */
        super("Holiday");
        con = getContentPane();
        startDateLabel = new JLabel("Start date: ");
        endDateLabel = new JLabel("End date: ");
        placeLabel = new JLabel("Place: ");
        priceLabel = new JLabel("Price: ");
        startDateText = new JTextField("",20);
        endDateText = new JTextField("",20);
        placeText  = new JTextField("",20);
        priceText  = new JTextField("",20);
        subButton1 = new JButton("Submit");
        subButton2 = new JButton("Submit");
        compareButton = new JButton("Compare");
        /*
       * Sets the layout
       */
        FlowLayout myLayout = new FlowLayout();
        con.setLayout(myLayout);

        /*
       * Add all created GUI elements to our content pane
       */
        con.add(startDateLabel);
        con.add(startDateText);
        con.add(endDateLabel);
        con.add(endDateText);
        con.add(placeLabel);
        con.add(placeText);
        con.add(priceLabel);
        con.add(priceText);
        con.add(subButton1);
        con.add(subButton2);
        con.add(compareButton);



        try{
            subButton1.addActionListener(new ActionListener() {
                                             public void actionPerformed(ActionEvent e) {
                                                 // we use some information from the ActionEvent object
                                                 hol1 = new Holiday();
                                                 hol1.setStartDate(startDateText.getText());
                                                 hol1.setEndDate(endDateText.getText());
                                                 hol1.setPlace(placeText.getText());
                                                 hol1.setPrice(Double.parseDouble(priceText.getText()));                                               
                                                 JOptionPane.showMessageDialog(DemoHolidayGUI.this,
                                                         "Holiday has been created.\n" + "Start date: " + hol1.getStartDate() +"\n" +
                                                                 "End date: " +hol1.getEndDate() +"\n" + "Place: " + hol1.getPlace() + "\n" + "Price: " + hol1.getPrice(),
                                                         "Confimation",JOptionPane.WARNING_MESSAGE);

                                              		}

                                                  }
                                   
            );
        }catch (Exception e){
            JOptionPane.showMessageDialog(DemoHolidayGUI.this,"Complete correct all text fields","Error",JOptionPane.ERROR_MESSAGE);
        }


        subButton2.addActionListener(new ActionListener() {
                                                             public void actionPerformed(ActionEvent e) {
                                                                 // we use some information from the ActionEvent object
                                                                 hol2 = new Holiday();
                                                                 hol2.setStartDate(startDateText.getText());
                                                                 hol2.setEndDate(endDateText.getText());
                                                                 hol2.setPlace(placeText.getText());
                                                                 hol2.setPrice(Double.parseDouble(priceText.getText()));
                                                                 JOptionPane.showMessageDialog(DemoHolidayGUI.this,
                                                                         "Holiday has been created.\n" + "Start date: " + hol2.getStartDate() +"\n" +
                                                                         "End date: " +hol2.getEndDate()  + "\n" + "Place: " + hol2.getPlace() + "\n" + "Price: " + hol2.getPrice(),
                                                                         "Confimation",JOptionPane.WARNING_MESSAGE);
                                                             }
                                                         }
        );
        compareButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // we use some information from the ActionEvent object
            	super.equals(hol1);
            	System.out.println(super.equals(hol1));
//                hol1.getEndDate().equals(hol2.getEndDate());
//                hol1.getStartDate();
//                hol1.getPlace();
//                hol1.getPrice();
//                JOptionPane.showMessageDialog(DemoHolidayGUI.this,
//                        "Holiday has been created.\n" + "Start date: " + hol2.getStartDate() +"\n" +
//                        "End date: " +hol2.getEndDate()  + "\n" + "Place: " + hol2.getPlace() + "\n" + "Price: " + hol2.getPrice(),
//                        "Confirmation",JOptionPane.WARNING_MESSAGE);
            }
        }
);

                /*
       * Do some required layout stuff, tell Java to exit when we press the Close button
       */
        pack();
        setLocation(210,150);
        setSize(250, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public static void main(String [] args)
    {
        DemoHolidayGUI newHoliday = new DemoHolidayGUI();

    }

}
