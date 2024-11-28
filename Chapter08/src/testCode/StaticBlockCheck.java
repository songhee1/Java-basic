package testCode;

public class StaticBlockCheck {

    public static void main(String[] args) {
        StaticBlockCheck sc = new StaticBlockCheck();
//        sc.makeStaticBlockObject();
        sc.makeStaticBlockObjectWithData();
    }
    public void makeStaticBlockObject(){
        System.out.println("creating block1");
        StaticBlock block1 = new StaticBlock();// 객체 생성전 static 블록 호출
        System.out.println("creating block1");
        System.out.println("------------------");
        System.out.println("creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("creating block2");
    }
    public void makeStaticBlockObjectWithData(){
        System.out.println("data = "+StaticBlock.getData()); // 클래스 참조 발생시 static블록 호출, 5
        StaticBlock block1 = new StaticBlock();
        block1.data = 1;
        System.out.println("------------------");
        StaticBlock block2 = new StaticBlock();
        block2.data = 2;
        System.out.println("data = "+StaticBlock.getData());
    }
}
