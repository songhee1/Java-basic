package testCode.c.string;

public class StringCompare {

    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        sample.checkCompare();
        System.out.println("===");
        sample.checkCompare2();
        System.out.println("===");
        sample.checkCompare3();
        System.out.println("===");
        sample.compareTo();
    }
    public void checkCompare(){
        String text = "Check Value";
        String text2 = "Check Value";

        if(text == text2){ // String 리터럴은 constant pool에서 같은 주소참조, 재사용
            System.out.println("text==text2 result is same"); // 출력
        }else{
            System.out.println("text==text2 result is different");
        }

        if(text.equals(text2)){
            System.out.println("text.equals(text2) result is same"); // 출력
        }
    }

    public void checkCompare2(){
        String text = new String("Check Value");
        String text2 = new String("Check Value");

        if(text == text2){ // String new 객체는 다른 주소 참조
            System.out.println("text==text2 result is same");
        }else{
            System.out.println("text==text2 result is different"); // 출력
        }

        if(text.equals(text2)){
            System.out.println("text.equals(text2) result is same"); // 출력
        }
    }

    public void checkCompare3(){
        String text = new String("Check Value");
        String text2 = new String("check value");

        if(text.equalsIgnoreCase(text2)){ // 대소문자 구분 없이 문자열 비교
            System.out.println("text.equalsIgnoreCase(text2) result is same");
        }
    }

    public void compareTo(){ // 매개변수로 넘어온 String객체가 알파벳 순으로 앞에 있으면 양수, 반대면 음수
        String text = "a";
        String text2 = "b";
        String text3 = "c";
        System.out.println(text2.compareTo(text)); //1
        System.out.println(text2.compareTo(text3)); //-1
        System.out.println(text.compareTo(text3)); //-2
    }
}
