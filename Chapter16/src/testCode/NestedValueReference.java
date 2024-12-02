package testCode;

public class NestedValueReference {
    public int publicInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    private int privateInt = 3;
    static int staticInt = 4;
    static class StaticNested{ // static nested 클래스 static  변수 참조가능
        public void setValue(){
            staticInt = 14;
        }
    }
    class Inner{ // 내부클래스/익명클래스 모두 어떤 변수라도 참조가능
        public void setValue(){
            public void setValue(){
                publicInt = 20;
                protectedInt = 21;
                justInt = 22;
                privateInt = 23;
                staticInt = 24;
            }
        }
    }
    public void setValue(){
        publicInt = 30;
        protectedInt = 31;
        justInt = 32;
        privateInt = 33;
        staticInt = 34;
    }
}
