package testCode.args;

public class ChildArg extends ParentArg{
    public ChildArg(){ // 자동으로 컴파일시 super()
        super("ChildArg"); // 첫줄 선언
//        super(null); //자바 컴파일러 정하기x, reference to ParentArg is ambiguous
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {

    }
}
