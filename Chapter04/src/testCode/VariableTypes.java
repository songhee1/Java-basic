package testCode;

public class VariableTypes {
    public void anotherMethod(){
        if(true){
            int localVariable;
            if (true) {
                int localVariable; // javac실행시 컴파일에러(동일 지역변수)
            }
        }
        if(true){
            int localVariable;
        }
    }

    // 참조 자료형
    String bookName = "God Of Java";
    String bookName2 = new String("God Of Java");
}
