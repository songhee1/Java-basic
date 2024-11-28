package c.javapackage;

import static c.javapackage.sub.SubStatic.subStaticMethod;
import static c.javapackage.sub.SubStatic.CLASS_NAME;
//import static c.javapackage.sub.SubStatic.*;

public class PackageStaticImport {
    // 같은 이름의 static method/variable이 우선됨
    public final static String CLASS_NAME = "SubStatic";
    public static void subStaticMethod(){
        System.out.println("substatic method called");
    }
    public static void main(String[] args) {
        subStaticMethod(); // static 변수/메서드 사용시 import static
        System.out.println(CLASS_NAME);
    }
}
