package testCode.c.util;

public class FinalVariable {
    final int instanceVariable = 1; //final 인스턴스변수/클래스변수 생성과 동시에 초기화 필요

    public void method(final int parameter){ //final 매개변수/지역변수 초기화필요x
        final int localVariable;
        localVariable = 2;
//        localVariable = 3; 에러

    }
}
