package testCode.c.exception;

public class ThrowSample {

    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
        System.out.println("===");
//        sample.throwsException(13); // throwsException에서 예외 throw 했기에, 1. try-catch 2. throws 필요

        // 1.
        try{
            sample.throwsException(13);
        }catch (Exception e){

        }
    }
    public void throwException(int number){
        try{
            if(number>12){
                throw new Exception("Number is over than 12");

            }
            System.out.println("Number is "+number);
        }catch (Exception e){
            e.printStackTrace(); //수행
        }
        //해당하는 예외없다면 메서드를 호출한 메서드로 던짐
    }
    public void throwsException(int number) throws Exception{
        if(number>12){
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is "+number);
    }

}
