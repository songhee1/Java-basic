package testCode;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator class");
        Calculator dCal = new Calculator();// 기본생성자-javac 컴파일시 자동생성
        Calculator cCal = new Calculator();
        int a = 10;
        int b = 5;
        System.out.println(dCal.add(a, b));
        System.out.println(dCal.subtract(a, b));
        System.out.println(dCal.multiply(a, b));
        System.out.println(dCal.divide(a, b));

        cCal.setName("Min");
        cCal.setAge(20);
        System.out.println(cCal.printName());
        System.out.println(cCal.printAge());
    }
    private String name;
    private int age;
    private int add(int num1, int num2){
        return num1+num2;
    }
    private int subtract(int num1, int num2){
        return num1-num2;
    }
    private int multiply(int num1, int num2){
        return num1*num2;
    }
    private int divide(int num1, int num2){
        return num1/num2;
    }
    public void setName(String str){
        name = str;
    }
    public void setAge(int val){
        age = val;
    }
    public int printAge(){
        return age;
    }
    public String printName(){
        return name;
    }
}
