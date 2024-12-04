package testCode.generic;

public class WildCardSample {

    public static void main(String[] args) {
        WildCardSample sample = new WildCardSample();
        sample.callWildcardMethod();
    }
    public void callWildcardMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
//        WildcardGeneric<?> wildcard1 = new WildcardGeneric<String>(); 와일드타입 객체 생성x

        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }
   /* public void wildcardStringMethod(WildcardGeneric<String> c){ 다른 타입 객체 x
        String value = c.getWildcard();
        System.out.println(value);
    }*/
   public void wildcardStringMethod(WildcardGeneric<?> c){ // 여러 타입객체 매개변수 가능
       Object value = c.getWildcard();
       System.out.println(value);
   }
}
