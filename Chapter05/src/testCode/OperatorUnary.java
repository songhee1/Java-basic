package testCode;

public class OperatorUnary { // 단항연산자

    public static void main(String[] args) {
        OperatorUnary ou = new OperatorUnary();
        ou.unary();
    }
    public void unary(){
        int intValue = -10;
        int result = +intValue;
        System.out.println(result); // -10
        result = -intValue;
        System.out.println(result); // 10
    }
}
