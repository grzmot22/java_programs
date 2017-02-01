/**
 * Created by Ada on 2017-01-25.
 */
public class BasicCarEquipment {
    private String carName;
    private String color;
    private String engine;
    private String hp;
    private  int wheelSize;
    private double engineCapacity;

    public void setCarName(String carName){
        this.carName = carName;
}
    public String getCarName(){
        return carName;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public String getEngine(){
        return engine;
    }
    public void setHp(String hp){
        this.hp = hp;
    }
    public String getHp(){
        return hp;
    }
    public void setWheelSize(int wheelSize){
        this.wheelSize = wheelSize;
    }
    public int getWheelSize(){
        return wheelSize;
    }
    public void setEngineCapacity(double engineCapacity){
        this.engineCapacity = engineCapacity;
    }
    public double getEngineCapacity(){
        return engineCapacity;
    }


    BasicCarEquipment(String carName, String color, String engine, String hp, int wheelSize, double engineCapacity){
        this.setCarName(carName);
        this.setColor(color);
        this.setEngine(engine);
        this.setHp(hp);
        this.setWheelSize(wheelSize);
        this.setEngineCapacity(engineCapacity);
    }
    BasicCarEquipment(){
        color ="";
        engine = "";
        hp = "";
        wheelSize = 0;
        engineCapacity = 0;
        carName = "";
    }
}
