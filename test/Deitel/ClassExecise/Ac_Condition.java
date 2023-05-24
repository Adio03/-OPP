package ClassExecise;

public class Ac_Condition {


    private boolean isOn;
    private int temperature;

    public void toggle_on( ) {
        /*
       if(isOn == false) isOn = true;
       else if (isOn == true) isOn = false;
      */
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }
    public int getTemperature(){
        return temperature;
    }

    public void increaseTemperature() {
            temperature ++;



        }
       
    }

