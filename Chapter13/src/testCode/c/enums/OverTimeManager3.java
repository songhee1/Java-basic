package testCode.c.enums;

public class OverTimeManager3 {
    public static void main(String[] args) {
        OverTimeValues2 []valueList = OverTimeValues2.values(); // enum class 선언된 모든 상수 배열로 리턴
        for (OverTimeValues2 overTimeValues2 : valueList) {
            System.out.println(overTimeValues2);
        }
    }
}
