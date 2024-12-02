package testCode.c.exception;

public class ThrowableSample {

    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable(); // nullpointerexception
        System.out.println("===");
        sample.throwable2(); // arrayindexoutofboundexception
    }
    public void throwable(){
        int[] intArray = new int[5];
        try{
            intArray = null;
            System.out.println(intArray[5]);
        }catch(Throwable t){
            System.out.println(t.getMessage()); // 예외 메세지 String 형태
            System.out.println("---");
            System.out.println(t.toString()); // 더 자세
            System.out.println("---");
            t.printStackTrace(); //  더 자세
        }
    }

    public void throwable2(){
        int[] intArray = new int[5];
        try{
            System.out.println(intArray[5]);
        }catch(Throwable t){
            System.out.println(t.getMessage()); // 예외 메세지 String 형태
            System.out.println("---");
            System.out.println(t.toString()); // 더 자세
            System.out.println("---");
            t.printStackTrace(); //  더 자세
        }
    }
}
