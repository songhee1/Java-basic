package testCode;

public class OperationMultipleDivision {

    public static void main(String[] args) {
        OperationMultipleDivision om = new OperationMultipleDivision();
        om.divideInt();
        om.divideInt2();
        om.divideInt3();
    }
    public void divideInt(){
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue2/intValue1;
        System.out.println("result = "+result); // 2
    }
    public void divideInt2(){
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1/intValue2;
        System.out.println("result = "+result); // 0
    }
    public void divideInt3(){
        double doubleValue1 = 5;
        double doubleValue2 = 10;
        double result = doubleValue1/doubleValue2;
        System.out.println("result = "+result); // 0.5
    }
}
