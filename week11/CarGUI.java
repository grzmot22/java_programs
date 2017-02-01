import javax.swing.*;
import java.util.Scanner;
import java.util.Locale;
/*
* Program CarGUI is modified to input data from user.
*It's modified version of Car from the week 5 example code.
*
*@author Boguslaw Smolarczyk 1612761
* @version 31.10.16
*/
public class CarGUI {

    /*
        * The properties of a car
        */
    String model;  // the car model
    String colour;  // the car color
    int numOfPassengers; // how many passengers are in the car?
    double amountOfGas;  // the amount of gas


    public CarGUI(String col, String mod, int num, double gas) {
        model = mod;
        colour = col;
        numOfPassengers = num;
        amountOfGas = gas;
    }


    /*
 * Sets the amount of gas. This method changes the amount of gas
 * property of the object, but does not return anything.
 */
    public void setAmountOfGas(double amount) {
        amountOfGas = amount;
    }

    /*
     * Gets the current amount of gas. This method returns the current
     * amount of gas as a double value.
     */
    public double getAmountOfGas()
    {
        return amountOfGas;
    }

    /*
     * This adds a passenger to your car.
     */
    public void addPassenger() {
        numOfPassengers++;

        // alternatively:
        // numOfPassengers = numOfPassengers + 1;
    }

    /*
     * This removes a passenger from your car.
     */
    public void removePassenger() {
        numOfPassengers--;

        // alternatively:
        // numOfPassengers = numOfPassengers - 1;
    }

    /*
    * This returns the current number of passengers as an integer value.
    */
    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    /*
    * This returns the model of the car as a String object
    */
    public String getModel() {
        return model;
    }

    /*
    * This returns the colour of the car as a String object
    */
    public String getColour() {
        return colour;
    }



    public static void main(String[] args){
        String mod;
        String col;
        int num;
        double gas;
//        Scanner keyboard = new Scanner(System.in);
//        keyboard.useLocale(Locale.UK);
        mod = JOptionPane.showInputDialog("Please enter model a car:");
        col = JOptionPane.showInputDialog("Please enter color of the car:");
        String StNum = JOptionPane.showInputDialog("Please enter number of passengers:");
        num = Integer.parseInt(StNum);
        String StGas = JOptionPane.showInputDialog("Please enter amount of gas:");
        gas = Double.parseDouble(StGas);
        CarGUI myCarGUI = new CarGUI(mod, col, num, gas);
        System.out.println("My car is a " + myCarGUI.getModel()
                + " and it is " + myCarGUI.getColour() + ".");


        /*
         * Get and print the amount of gas
         */
        double gasAmount = myCarGUI.getAmountOfGas();
        System.out.println("The current amount of gas is " + gasAmount + ".");


        /*
         * Add and print a new passenger
         */
        myCarGUI.addPassenger(); // a new passenger
        myCarGUI.addPassenger(); // and another one
        int passengers = myCarGUI.getNumOfPassengers();
        System.out.println("My car carries " + passengers
                + " passengers right now.");

        /*
         * Refill the tank, print new value
         */
        myCarGUI.setAmountOfGas(gas + 30.1); // fill the tank
        gasAmount = myCarGUI.getAmountOfGas();
        System.out.print("I refilled my car! "); // note the use of print()
        System.out.println("Now the current amount of gas is "
                + gasAmount + ".");

        /*
         * Remove one passenger, print updated number of
         * passengers
         */
        myCarGUI.removePassenger(); // 1 passenger stepped off
        passengers = myCarGUI.getNumOfPassengers();
        System.out.println("My car carries " + passengers
                + " passengers right now.");
    }
}
