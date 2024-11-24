package testCode;

public class PrimitiveTypesSecond {
    byte byteDefault;
    short shortDefault;
    int intDefault;
    long longDefault;
    float floatDefault;
    double doubleDefault;
    char charDefault;
    boolean booleanDefault;

    public static void main(String[] args) {
        PrimitiveTypesSecond second = new PrimitiveTypesSecond();
        second.defaultValues();
    }

    private void defaultValues() {
        //모든 숫자 기본값 0
        System.out.println("byteDefault="+byteDefault);
        System.out.println("shortDefault="+shortDefault);
        System.out.println("intDefault="+intDefault);
        System.out.println("longDefault="+longDefault);
        System.out.println("floatDefault="+floatDefault);
        System.out.println("doubleDefault="+doubleDefault);
        System.out.println("charDefault="+charDefault); // '\u0000' 공백
        System.out.println("booleanDefault="+booleanDefault);
    }
}
