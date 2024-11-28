package testCode;

import java.lang.reflect.Method;

public class MethodVarargs {

    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();
        varargs.calculateNumberWithArray(new int[]{1,2,3,4,5});
        varargs.calculateNumbers(1);
        varargs.calculateNumbers(1,2);
        varargs.calculateNumbers(1,2,3);
        varargs.calculateNumbers(1,2,3,4);
        varargs.calculateNumbers(1,2,3,4,5);

    }
    public void calculateNumberWithArray(int array[]){

    }
    public void calculateNumbers(int ...numbers){  // 타입...변수명-배열
        int total = 0;
        for(int number:numbers){
            total += number;
        }
        System.out.println("total = "+total);
    }
}
