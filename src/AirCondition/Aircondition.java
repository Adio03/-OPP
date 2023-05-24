package AirCondition;

public class Aircondition {
    private boolean isOn = false;
    private int temperature = 16;

    public void toggleOn() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void increaseTemperature(){
        if(temperature < 30) temperature +=1;
    }

    public int decreaseAirCondition() {
         return 0;
    }

    public int getTemperature() {
        return temperature;
    }
}