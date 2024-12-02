package testCode;

public class ReferenceAtNested {
    static class StaticNested{
        private int staticNestedInt = 99;
    }
    class Inner{
        private int innerValue = 100;
    }
    public void setValue(int value){ // private인 변수까지 static nested/내부 클래스의 변수 접근 가능
        StaticNested nested = new StaticNested();
        nested.staticNestedInt = value;
        Inner inner = new Inner();
        inner.innerValue = value;
    }
}
