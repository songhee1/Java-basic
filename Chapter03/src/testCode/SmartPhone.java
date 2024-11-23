package testCode;

public class SmartPhone {
    private int power;
    private int volume;
    private void powerOn(){
        power = 1;
    }
    private void powerOff(){
        power = 0;
    }
    private void volumnUp(){
        volume++;
    }
    private void volumnDown(){
        volume--;
        if(volume <0) volume = 0;
    }
}
