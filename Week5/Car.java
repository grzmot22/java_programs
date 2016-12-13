
/**
 * Example with car class
 * 
 * @author (grzmot22) 
 * @version (17/10/16)
 */
public class Car
{

    /*
     * Car attributes
     */
    String colour;
    int numOfPassengers = 0;
    
    /*
     * Adds a passenger
     */
    public void addPassenger(){
        numOfPassengers = numOfPassengers +1;
    }
    
    /*
     * Returns the number of passengers
     */
    public int getNumOfPassengers() {
        return numOfPassengers;
    }
    
    public static void main(String[] args) {
        Car myCar = new Car(); // a new car object
        
        // gets and prints the number of passengers
        int numPassenger = myCar.getNumOfPassengers();
        System.out.println("The number of passengers is " 
            + numPassenger);
            
        // a new passenger enters; add and print    
        myCar.addPassenger(); // a new passenger enters our car
        numPassenger = myCar.getNumOfPassengers();
        System.out.println("The number of passengers is " 
            + numPassenger);
        
    }
}
