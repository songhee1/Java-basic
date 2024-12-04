package testCode.lang;

public class JavaLangSystemPrint {

    public static void main(String[] args) {

    }
    public void printStreamCheck(){
        byte b = 127;
        short s = 32767;
        System.out.println(b); // int 형변환
        System.out.println(s);
        printInt(b);
        printInt(s);
    }
    public void printInt(int value){
        System.out.println(value);
    }
    public void printNull(){
        Object obj = null;
        System.out.println(obj); // String.valueOf(null) 호출
        System.out.println(obj+" is object's value"); // StringBuilder.append() 변환
    }
}
