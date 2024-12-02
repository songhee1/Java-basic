package testCode.staticNested;

import testCode.staticNested.OuterOfStatic.StaticNested;

public class NestedSample {

    public static void main(String[] args) {
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();
    }

    private void makeStaticNestedObject() {
        OuterOfStatic.StaticNested staticNested = new StaticNested(); // static nested class 객체생성
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }
}
