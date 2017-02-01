// imput elements of GUI
import java.awt.*;  // import elements from awt
        import java.awt.event.*; // import elements from awt.event
        import javax.swing.*;   // import elements form swing  graphic library
/**
 * Program shows a windows with four buttons,
 * which changes the text on center of the window.
 *
 *@author Boguslaw Smolarczyk 1612761
 * @version 09.01.17
 */
public class Navigator extends JFrame { // expand my class with JFrame class

    public Navigator() {
        // creates the JFrame
        super("Navigator"); // declare super class and add the title of the window
        JButton leftButton = new JButton("Left"); // create a left button
        JButton upButton =new JButton("Up"); // create a up button
        JButton downButton = new JButton("Down"); // create a down button
        JButton rightButton = new JButton("Right"); // create a right button
        JLabel centerLabel =new JLabel("Click any button"); // create a center label

        // get the container object
        Container con = getContentPane();

        // set the layout of the container object
        con.setLayout(new BorderLayout());

        // now add the buttons
        con.add(leftButton, BorderLayout.WEST);  // add left button to container, also set place where will be show it (left side of the window)
        con.add(upButton, BorderLayout.NORTH);  // add up button to container, also set place where will be show it (top side of the window)
        con.add(downButton, BorderLayout.SOUTH);  // add down button to container, also set place where will be show it (bottom side of the window)
        con.add(rightButton, BorderLayout.EAST);  // add right button to container, also set place where will be show it(right side of the window)
        con.add( centerLabel, BorderLayout.CENTER);  // add center label to container, also set place where will be show it(center side of the window)

        /*create new listener to the up button
         when you click on the up button the program will run code inside.
         When you click on the Up button, in the center will change the text to "Going up!".
         */
        upButton.addActionListener(new ActionListener() {
                                       public void actionPerformed(ActionEvent e) {
                                           centerLabel.setText("Going up!"); // changes text in label to "Going up!"
                                       }
                                   }
        );

        /*create new listener to the down button
         when you click on the down button the program will run code inside.
         When you click on the down button, in the center will change the text to "Going down!".
         */
        downButton.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {
                                             centerLabel.setText("Going down!"); // changes text in label to "Going down!"
                                         }
                                     }
        );

        /*create new listener to the left button
         when you click on the left button the program will run code inside.
         When you click on the left button, in the center will change the text to "Going left!".
         */
        leftButton.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {
                                             centerLabel.setText("Going left!"); // changes text in label to "Going left!"
                                         }
                                     }
        );

        /*create new listener to the right button
         when you click on the right button the program will run code inside.
         When you click on the right button, in the center will change the text to "Going right!".
         */
        rightButton.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent arg) {
                                              centerLabel.setText("Going right!"); // changes text in label to "Going right!"
                                          }
                                      }
        );


        // pressing the close button should exit the application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Causes this Window to be sized to fit the preferred size
        // and layouts of its subcomponents
        pack();

        // shows the window
        setVisible(true); // set the window as visible
        setSize(400, 400); // setup the window size: width: 400px, height: 400px
    }
    //Main method is need to run the program
    public static void main(String args[]){
        Navigator navi = new Navigator(); // run the Navigator method and shows the window.
    }
}
