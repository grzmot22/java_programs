import java.util.Scanner;
import java.util.Locale;
/*
* Program CarIO is modified to input data from user.
*It's modified version of Car from the week 5 example code.
*
*@author @author Grzmot22
* @version 31.10.16
*/
public class CarIO {

    /*
        * The properties of a car
        */
    String model;  // the car model
    String colour;  // the car color
    int numOfPassengers; // how many passengers are in the car?
    double amountOfGas;  // the amount of gas


    public CarIO(String col, String mod, int num, double gas) {
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


    //public CarIO() {
    public static void main(String[] args){
        String mod;
        String col;
        int num;
        double gas;
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.UK);
        System.out.println("Enter model a car:");
        mod = keyboard.next();
        System.out.println("Enter color of the car:");
        col = keyboard.next();
        System.out.println("Enter number of passengers:");
        num = keyboard.nextInt();
        System.out.println("Enter amount of gas:");
        gas = keyboard.nextDouble();
        CarIO myCarIO = new CarIO(mod, col, num, gas);
        System.out.println("My car is a " + myCarIO.getModel()
                + " and it is " + myCarIO.getColour() + ".");


        /*
         * Get and print the amount of gas
         */
        double gasAmount = myCarIO.getAmountOfGas();
        System.out.println("The current amount of gas is " + gasAmount + ".");


        /*
         * Add and print a new passenger
         */
        myCarIO.addPassenger(); // a new passenger
        myCarIO.addPassenger(); // and another one
        int passengers = myCarIO.getNumOfPassengers();
        System.out.println("My car carries " + passengers
                + " passengers right now.");

        /*
         * Refill the tank, print new value
         */
        myCarIO.setAmountOfGas(gas + 30.1); // fill the tank
        gasAmount = myCarIO.getAmountOfGas();
        System.out.print("I refilled my car! "); // note the use of print()
        System.out.println("Now the current amount of gas is "
                + gasAmount + ".");

        /*
         * Remove one passenger, print updated number of
         * passengers
         */
        myCarIO.removePassenger(); // 1 passenger stepped off
        passengers = myCarIO.getNumOfPassengers();
        System.out.println("My car carries " + passengers
                + " passengers right now.");
    }
}
