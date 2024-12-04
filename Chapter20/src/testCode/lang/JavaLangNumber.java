package testCode.lang;

public class JavaLangNumber {

    public static void main(String[] args) {
        JavaLangNumber sample = new JavaLangNumber();
        sample.numberTypeCheck();
        System.out.println("===");
        sample.numberMinMaxCheck();
    }
    public void numberTypeCheck(){
        String value1 = "3";
        String value2 = "5";
        byte byte1 = Byte.parseByte(value1);// parse : 기본자료형 반환
        byte byte2 = Byte.parseByte(value2);
        System.out.println(byte1+byte2);
        
        Integer refInt1 = Integer.valueOf(value1); // valueOf : 참조 자료형 반환
        Integer refInt2 = Integer.valueOf(value2); // new 없이도 값 할당
        System.out.println(refInt1+refInt2+"7");
    }
    public void numberTypeCheck2(){
        Integer refInt1 = 100;
        System.out.println(refInt1.doubleValue());
    }
    public void numberMinMaxCheck(){
        System.out.println("Byte min="+Byte.MIN_VALUE+" max = "+Byte.MAX_VALUE);
        System.out.println("Short min="+Short.MIN_VALUE+" max = "+Short.MAX_VALUE);
        System.out.println("Integer min="+Integer.toBinaryString(Integer.MIN_VALUE)+" max = "+Integer.toBinaryString(Integer.MAX_VALUE)); // 2진수 변환
        System.out.println("Long min="+Long.toHexString(Long.MIN_VALUE)+" max = "+Long.toHexString(Long.MAX_VALUE)); // 16진수 변환
        System.out.println("Float min="+Float.MIN_VALUE+" max = "+Float.MAX_VALUE);
        System.out.println("Double min="+Byte.MIN_VALUE+" max = "+Double.MAX_VALUE);
        System.out.println("Character min="+(int)Character.MIN_VALUE+" max = "+(int)Character.MAX_VALUE);
    }
}
