/**
 *@author Boguslaw Smolarczyk 1612761
 * @version 23.01.17
 */
public class DemoValidationExtraCarEquipment {
    public static void main(String[] args){
        ValidationExtraCarEquipment myDemoValidationExtraCarEquipment1;
        new DemoValidationExtraCarEquipment();
        myDemoValidationExtraCarEquipment1 = new ValidationExtraCarEquipment("","","","",0,0,"","",-1);
        System.out.println("Car model = " + myDemoValidationExtraCarEquipment1.getCarName());
        System.out.println("Car color = " + myDemoValidationExtraCarEquipment1.getColor());
        System.out.println("Engine type = " + myDemoValidationExtraCarEquipment1.getEngine());
        System.out.println("Engine capacity = " + myDemoValidationExtraCarEquipment1.getEngineCapacity() + "L");
        System.out.println("Power = " + myDemoValidationExtraCarEquipment1.getHp());
        System.out.println("Wheel size = " + myDemoValidationExtraCarEquipment1.getWheelSize() +"'");
        System.out.println("Lights type = " + myDemoValidationExtraCarEquipment1.getCarLights());
        System.out.println("Installed car audio = " + myDemoValidationExtraCarEquipment1.getCarAudio());
        System.out.println("Extra boost = " + myDemoValidationExtraCarEquipment1.getExtraHp() +"HP");

    }
}
