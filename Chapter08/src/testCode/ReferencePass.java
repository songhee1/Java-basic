package testCode;

public class ReferencePass {

    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
//        reference.callByValue();
        reference.callPassByReference();
    }

    private void callByValue() {
        int a = 10;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a = "+a);//10
        System.out.println("b = "+b);//b
        passByValue(a, b);
        System.out.println("after passByValue");
        System.out.println("a = "+a);//10
        System.out.println("b = "+b);// b
    }

    private void passByValue(int a, String b) { // 기본자료형-값 전달
        a = 20;
        b = "z"; // b = new String("z")
        System.out.println("in passByValue");
        System.out.println("a = "+a);//20
        System.out.println("b = "+b);//z
    }

    public void callPassByReference(){
        MemberDTO member = new MemberDTO("sangmin");
        System.out.println("before passByReference");
        System.out.println("member.name = "+member.getName());//sangmin
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member.name = "+member.getName()); // sungchoon
    }

    private void passByReference(MemberDTO member) { // 참조 자료형-객체에 대한 참조 전달
        member.setName("sungchoon");
        System.out.println("in passbyreference");
        System.out.println("member.name = "+member.getName());//sungchoon
    }
}
