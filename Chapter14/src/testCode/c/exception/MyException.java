package testCode.c.exception;

public class MyException extends Exception{ // 예외클래스 만들 경우 Throwable 직계자손 상속필요
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}
