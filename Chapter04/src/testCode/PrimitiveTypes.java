package testCode;

public class PrimitiveTypes {
    int intDefaultValue1;

    public static void main(String[] args) {
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        primitiveTypes.checkByte();
        primitiveTypes.checkOtherTypes();
        primitiveTypes.checkChar();
    }
    public void checkByte(){
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin = "+byteMin);
        System.out.println("byteMax = "+byteMax);
        byteMin = (byte) (byteMin-1);
        byteMax = (byte) (byteMax+1);
        System.out.println("byteMin-1 = " + byteMin); // 127
        System.out.println("byteMax+1 = " + byteMax); // -128
    }
    public void checkOtherTypes(){
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        shortMax = (short) (shortMax+1);
        intMax = (int) (intMax+1);
        longMax = (long) (longMax+1);
        System.out.println("shortMax-1 = "+shortMax); // -32768
        System.out.println("intMax-1 = "+intMax); // -2147483648
        System.out.println("longMax-1 = "+longMax); // -9223372036854775808L
    }
    public void checkChar(){
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin = ["+charMin+"]"); // 공백
        System.out.println("charMax = ["+charMax+"]");

        int intValue = 'a';
        System.out.println("intValue = "+intValue); // 97
        //1.'' 2. "\U"+16진수 3.유니코드(0~65,535)
    }
    public void defaultValues(){
        int intDefaultValue2; // 지역변수 초기화 필수
        System.out.println(intDefaultValue1);
//        System.out.println(intDefaultValue2); 컴파일에러
    }
}
