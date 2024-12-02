package testCode.c.exception;

public class FinallySample {

    public static void main(String[] args) {
        FinallySample sample = new FinallySample();
        sample.finallySample();
    }
    public void finallySample(){
        int[] intArray = new int[5]; // 배열 초기화시 각 타입 기본값 할당
        try{
            System.out.println(intArray[4]);
        }catch(Exception e){
            System.out.println(intArray.length);
        }finally {
            System.out.println("Here is finally");
        }
        System.out.println("This code must run");
    }
}
