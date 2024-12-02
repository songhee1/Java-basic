package testCode.c.exception;

import java.sql.SQLOutput;

public class ExceptionSample {

    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBounds();
    }
    public void arrayOutOfBounds(){
        int[] intArray = null; // catch 블록에서 사용하는 변수 선언
        try{
            intArray = new int[5];
            System.out.println(intArray[5]);
        }catch(Exception e){
            System.out.println(intArray.length);
            System.err.println("Exception occured");
        }
        System.out.println("This code must run");

    }
}
