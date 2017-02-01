/**
 *@author Boguslaw Smolarczyk 1612761
 * @version 23.01.17
 */
public class ValidationExtraCarEquipment extends ExtraCarEquipment {
    ValidationExtraCarEquipment(String carName, String color, String engine, String hp, int wheelSize, int engineCapacity, String carLights, String carAudio, int extraHp){
        super(carName, color,engine,hp,wheelSize,engineCapacity,carLights,carAudio,extraHp);
    }
    public  void setColor(String color) {
        if (color !="") {
            super.setColor(color);
        } else {
            System.out.println("Write the color of car.");
        }
    }
    public  void setEngine(String engine) {
        if (engine !="") {
            super.setEngine(engine);
        } else {
            System.out.println("Write the engine type.");
        }
    }
    public  void setHp(String hp) {
        if (hp !="") {
            super.setHp(hp);
        } else {
            System.out.println("Write the car's horse power.");
        }
    }
    public  void setCarLights(String carLights) {
        if (carLights !="") {
            super.setCarLights(carLights);
        } else {
            System.out.println("Write the carLights name.");
        }
    }
    public  void setCarAudio(String carAudio) {
        if (carAudio !="") {
            super.setCarAudio(carAudio);
        } else {
            System.out.println("Write the car audio name.");
        }
    }
    public  void setWheelSize(int wheelSize) {
        if (wheelSize > 0) {
            super.setWheelSize(wheelSize);
        } else {
            System.out.println("Write correct wheel size.");
        }
    }
    public  void setEngineCapacity(double engineCapacity) {
        if (engineCapacity > 0) {
            super.setEngineCapacity(engineCapacity);
        } else {
            System.out.println("Write correct engine capacity");
        }
    }
    public  void setExtraHp(int extraHp) {
        if (extraHp >= 0) {
            super.setExtraHp(extraHp);
        } else {
            System.out.println("Write correct boost power.");
        }
    }
}
