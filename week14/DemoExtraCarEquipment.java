/**
 *@author Boguslaw Smolarczyk 1612761
 * @version 23.01.17
 */
public class DemoExtraCarEquipment {
    public static void main(String[] args){
        ExtraCarEquipment myExtraCarEquipment;
        new ExtraCarEquipment();
        myExtraCarEquipment = new ExtraCarEquipment("BMW","black","V8","300 HP",18,3.0,"BiXenon","Harman/Kardon",20);
        System.out.println("Car model = " + myExtraCarEquipment.getCarName());
        System.out.println("Car color = " + myExtraCarEquipment.getColor());
        System.out.println("Engine type = " + myExtraCarEquipment.getEngine());
        System.out.println("Engine capacity = " + myExtraCarEquipment.getEngineCapacity() + "L");
        System.out.println("Power = " + myExtraCarEquipment.getHp());
        System.out.println("Wheel size = " + myExtraCarEquipment.getWheelSize() +"'");
        System.out.println("Lights type = " + myExtraCarEquipment.getCarLights());
        System.out.println("Installed car audio = " + myExtraCarEquipment.getCarAudio());
        System.out.println("Extra boost = " + myExtraCarEquipment.getExtraHp() +"HP");


    }
}
