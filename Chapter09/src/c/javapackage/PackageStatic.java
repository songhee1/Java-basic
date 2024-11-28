package c.javapackage;

import c.javapackage.sub.SubStatic;

public class PackageStatic {

    public static void main(String[] args) {
        SubStatic.subStaticMethod();
        System.out.println(SubStatic.CLASS_NAME);
        Package p = new Package(); // 같은 패키지 내에 있어서 import x
    }
}
