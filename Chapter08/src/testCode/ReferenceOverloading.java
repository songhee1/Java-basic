package testCode;

public class ReferenceOverloading {

    public static void main(String[] args) {

    }
    public void print(int data){}
    public void print(String data){}
    public void print(int intData, String stringData){}
    public void print(String stringData, int intData){}
    // 타입(순서), 메소드명 동일시 같은 메소드 인식
}
