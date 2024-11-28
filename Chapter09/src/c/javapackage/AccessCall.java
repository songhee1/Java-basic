package c.javapackage;

import c.javapackage.sub.AccessModifier;

public class AccessCall {

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
        /*accessModifier.protectedMethod(); // 같은 패키지 내/상속
        accessModifier.packagePrivateMethod(); // 같은 패키지 내
        accessModifier.privateMethod();*/ // 해당 클래스 내
    }
}
