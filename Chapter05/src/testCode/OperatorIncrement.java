package testCode;

public class OperatorIncrement { // 단항연산자

    public static void main(String[] args) {
        OperatorIncrement oi = new OperatorIncrement();
        oi.increment();
    }
    public void increment(){
        int intValue = 1;
        System.out.println(intValue++); // 1
        System.out.println(intValue); // 2
        System.out.println(++intValue); // 3
    }
}
