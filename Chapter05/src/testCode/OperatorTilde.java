package testCode;

public class OperatorTilde {//단항 연산

    public static void main(String[] args) {
        OperatorTilde ot = new OperatorTilde();
        byte b = 127; //01111111(127)
        ot.printTildeResult(b); // 10000000(-128)
        b = 1; // 00000001
        ot.printTildeResult(b); // 11111110
    }
    public void printTildeResult(byte b){
        System.out.println("Original value = "+b);
        System.out.println("Tilde valuev = "+ ~b); //~틸드 연산
    }
}
