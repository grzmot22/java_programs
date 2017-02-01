/**
 *@author Boguslaw Smolarczyk 1612761
 * @version 23.01.17
 */

public class DemoBasicCarEquipment {
    public static void main(String[] args){
        BasicCarEquipment myBasicCarEquipment;
        new BasicCarEquipment();
        myBasicCarEquipment = new BasicCarEquipment("BMW M3","black","V8","300 HP",18,3.0);
        System.out.println("Car model = " + myBasicCarEquipment.getCarName());
        System.out.println("Car color = " + myBasicCarEquipment.getColor());
        System.out.println("Engine type = " + myBasicCarEquipment.getEngine());
        System.out.println("Engine capacity = " + myBasicCarEquipment.getEngineCapacity() + "L");
        System.out.println("Power = " + myBasicCarEquipment.getHp());
        System.out.println("Wheel size = " + myBasicCarEquipment.getWheelSize() +"'");



    }
}
