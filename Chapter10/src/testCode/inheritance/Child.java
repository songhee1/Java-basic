package testCode.inheritance;

public class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    } // 컴파일시 super() 자동 호출

    public void printAge(){
        System.out.println("printAge()-18month");
    }
}
