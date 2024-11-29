package testCode;

public class StringLiteral {

    public static void main(String[] args) {
        String str1 = "abc"; //string literal
        String str2 = "abc";
        String str3 = new String("abc"); // string new
        String str4 = new String("abc"); // string new

        System.out.println(System.identityHashCode(str1) +", "+ System.identityHashCode(str2)); // 일치
        System.out.println(System.identityHashCode(str3) +", "+ System.identityHashCode(str4)); // 불일치

        // == 주소값 비교
        System.out.println("str1 == str2 : "+ (str1 == str2)); // true
        System.out.println("str1 == str3 : "+ (str1 == str3)); // false
        // equals 주소값/문자열 내부값 비교
        System.out.println("str1.equals(str2) : "+ str1.equals(str2)); // true, 동일 주소값 갖는 객체
        System.out.println("str3.equals(str4) : "+ str3.equals(str4)); // true, 문자열 내부 값 동일

        // 문자열 리터럴-intern호출
        String name = "lxxjn0";
        String nameNew = new String("lxxjn0");
        String internName = nameNew.intern();

        System.out.println(name.equals(internName));
        System.out.println(name == internName);
    }
}
