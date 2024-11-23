package testCode;

public class Car {
    int speed;
    int distance;
    String color;


    public Car() { // javac 컴파일시 자동으로 생성되는 기본 생성자, .class 내부
    }
    public void speedUp(){
        speed+=5;
    }
    public void breakDown(){
        speed-=10;
    }
    public int getCurrentSpeed(){
        return speed;
    }
}
