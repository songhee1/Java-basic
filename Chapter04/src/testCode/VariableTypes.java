package testCode;

public class VariableTypes {
    int instanceValue;//인스턴스변수
    static int classValue;//클래스변수

    public static void main(String[] args) { // 매개변수
        // 참조 자료형
        String bookName = "God Of Java";
        String bookName2 = new String("God Of Java");
    }
    public void anotherMethod(){
        if(true){
            int localVariable; // 지역변수 초기화 없이 실행시 컴파일에러
            if (true) {
//                int localVariable; // javac실행시 컴파일에러(동일 지역변수)
            }
        }
        if(true){
            int localVariable;
        }
    }
}
