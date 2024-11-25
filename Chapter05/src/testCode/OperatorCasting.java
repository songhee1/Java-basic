package testCode;

public class OperatorCasting {

    public static void main(String[] args) {
        OperatorCasting oc = new OperatorCasting();
        oc.casting();
        oc.casting2();
    }
    public void casting(){
        byte byteValue = 127;
        short shortValue = byteValue; // 형변환
        shortValue++;
        System.out.println(shortValue); // 128
        byteValue = (byte) shortValue; // 형변환
        System.out.println(byteValue); // -128, 앞 1바이트 사라짐
    }
    public void casting2(){
        short shortValue = 256;
        byte byteValue = (byte) shortValue;
        System.out.println(byteValue); // 0, 앞 1바이트 사라짐
        shortValue = 255; // 0000000011111111
        byteValue = (byte) shortValue; // -1, 11111111-> 음의 보수법으로 변환
        System.out.println(byteValue);
    }
}
