package testCode;

public class CarManager {

    public static void main(String[] args) {
        // 객체, 인스턴스 : 실제 사물을 나타내기 위한 것

        Car dogCar = new Car();
        Car cowCar = new Car();
        dogCar.speedUp();
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());
        dogCar.breakDown();
        System.out.println(dogCar.getCurrentSpeed());
    }
}
