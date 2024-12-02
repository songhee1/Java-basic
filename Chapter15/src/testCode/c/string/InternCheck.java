package testCode.c.string;

public class InternCheck {

    public static void main(String[] args) {
        InternCheck check = new InternCheck();
        check.internNoCheck();
        System.out.println("===");
        check.internCheck();
    }
    public void internNoCheck(){
        String text1 = "Java check";
        String text2 = "Java check";
        String text3 = new String("Java check");

        System.out.println(text1 == text2); // true, 상수풀 같은 주소
        System.out.println(text1 == text3); //false
        System.out.println(text1.equals(text3)); // true
    }

    public void internCheck(){
        String text1 = "Java check";
        String text2 = "Java check";
        String text3 = new String("Java check");
        text3 = text3.intern(); // 상수풀 관여됨

        System.out.println(text1 == text2); // true, 상수풀 같은 주소
        System.out.println(text1 == text3); //true
        System.out.println(text1.equals(text3)); // true
    }
}
