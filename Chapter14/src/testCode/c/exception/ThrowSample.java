package testCode.c.exception;

public class ThrowSample {

    public static void main(String[] args) throws Exception { // main()에서 에러 메서지
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
        System.out.println("===");
        sample.throwsException(13); // throwsException에서 예외 throw 했기에, 1. try-catch 2. throws 필요

    }
    public void throwException(int number){
        try{
            if(number>12){
                throw new Exception("Number is over than 12"); // 예외 발생시 예외 클래스 객체 생성

            }
            System.out.println("Number is "+number);
        }catch (Exception e){
            e.printStackTrace(); //수행
        }
        //해당하는 예외없다면 메서드를 호출한 메서드로 던짐(예외를 위임함)-컴파일에러
    }
    public void throwsException(int number) throws Exception{
        if(number>12){
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is "+number);
    }
    // throw 예외 던질 경우, 해당 메서드에서 try-catch/throws 미작성시 컴파일에러
    public void multiThrows() throws NullPointerException, Exception{ // 예외 클래스 나열 가능

    }
}
