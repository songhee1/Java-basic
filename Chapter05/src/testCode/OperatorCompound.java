package testCode;

public class OperatorCompound {

    public static void main(String[] args) {
        OperatorCompound oc = new OperatorCompound();
        oc.compound();
    }
    public void compound(){
        int intValue = 10;
        int sum = intValue+5;
        System.out.println(sum);
        int sum2 = sum-5;
        System.out.println(sum2);
        int sum3 = sum2*5;
        System.out.println(sum3);
        int sum4 = sum3/5;
        System.out.println(sum4);
        int sum5 = sum4%5;
        System.out.println(sum5);
    }
}
