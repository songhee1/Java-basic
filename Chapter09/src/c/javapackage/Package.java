package c.javapackage;

import c.javapackage.sub.*; // c.javapackage.sub에 선언된 클래스만 import

public class Package {
    public static void main(String[] args) {
        System.out.println("package class");
        Sub sub = new Sub();
        sub.subClassMethod();
    }
}
