/**
 *@author Boguslaw Smolarczyk 1612761
 * @version 23.01.17
 */
public class ExtraCarEquipment extends BasicCarEquipment {
    private String carLights;
    private String carAudio;
    private  int extraHp;
    public void setCarLights(String carLights){
        this.carLights = carLights;
    }
    public String getCarLights(){
        return carLights;
    }

    public void setCarAudio(String carAudio){
        this.carAudio = carAudio;
    }
    public String getCarAudio(){
        return carAudio;
    }

    public void setExtraHp(int extraHp){
        this.extraHp = extraHp;
    }
    public int getExtraHp(){
        return extraHp;
    }

    ExtraCarEquipment(String carName, String color, String engine, String hp, int wheelSize, double engineCapacity, String carLights, String carAudio, int extraHp){
        super(carName, color,engine,hp,wheelSize,engineCapacity);
        this.setCarLights(carLights);
        this.setCarAudio(carAudio);
        this.setExtraHp(extraHp);
    }
    ExtraCarEquipment(){
        carLights = "";
        carAudio = "";
        extraHp = 0;

    }
}
