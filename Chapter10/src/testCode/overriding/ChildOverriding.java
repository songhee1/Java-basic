package testCode.overriding;

public class ChildOverriding extends ParentOverriding{
    public ChildOverriding(){
        System.out.println("ChildOverriding Constructor");
    }
    public void printName(){
        System.out.println("ChildOverriding printName()");
    } // 컴파일 에러, 같은 이름 메서드 부모클래스에 존재
    /* 1. public String printName(){
        System.out.println("ChildOverriding printName()");
    } // 컴파일 에러, 같은 이름 메서드 부모클래스에 존재*/
   /* 2. private void printName(){
       System.out.println("ChildOverriding printName()");
   } // 컴파일 에러, 접근제어자 범위 축소*/

}
