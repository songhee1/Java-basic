package testCode;

public class OperatorComparision {// 비교연산, 결과는 모두 boolean
    // ==, != : 기본/참조 자료형 사용
    // 이외 : boolean제외 기본 자료형

    public static void main(String[] args) {
        OperatorComparision oc = new OperatorComparision();
        oc.comparison();
    }
    public void comparison(){
        char charValue = 'a';
        System.out.println(97 == charValue); // true
        int intValue = 1;
        double doubleValue = 1.0;
        System.out.println(intValue == doubleValue); // true
        boolean boolValue = true;
        boolean boolValue2 = true;
        System.out.println(boolValue == boolValue2); // true

    }
}
