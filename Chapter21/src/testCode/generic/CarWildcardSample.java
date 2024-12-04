package testCode.generic;

public class CarWildcardSample {

    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
    }

    private void callBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        WildcardGeneric<Bus> wildcard2 = new WildcardGeneric<Bus>();
        wildcard.setWildcard(new Car("Mustang"));
        wildcard2.setWildcard(new Bus("6900"));
        boundedWildcardMethod(wildcard);
        boundedWildcardMethod(wildcard2);
    }

    private void boundedWildcardMethod(WildcardGeneric<? extends Car> c) { // 타입범위 지정, 조회용 매개변수에만 지정
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
