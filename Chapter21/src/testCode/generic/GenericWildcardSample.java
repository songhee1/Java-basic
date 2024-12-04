package testCode.generic;

public class GenericWildcardSample {

    public static void main(String[] args) {
        GenericWildcardSample sample = new GenericWildcardSample();
        sample.callGenericMethod(); //Data
    }
    public <T> void genericMethod(WildcardGeneric<T> c, T addValue){ // 객체에 값추가 가능, 제네릭 타입 선언후 사용
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }
    public void callGenericMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        genericMethod(wildcard, "Data");
    }
    public <T extends Car> void boundedGenericMethod(WildcardGeneric<T> c, T addValue){ // 제네릭 타입 선언시 Bounded Wildcard 사용가능

    }
}
