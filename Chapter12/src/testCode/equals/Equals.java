package testCode.equals;

import java.util.HashSet;
import java.util.Set;

public class Equals {

    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMethod();
        thisObject.equalMethod2();
        thisObject.printHashCode();
    }
    public void equalMethod(){
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");

        if(obj1 == obj2){ // 주소값 비교, 참조자료형 사용x
            System.out.println("obj1 and obj2 is same");
        }else{
            System.out.println("obj1 and obj2 is different"); // 출력
        }
    }

    public void equalMethod2(){
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");

        if(obj1.equals(obj2)){
            System.out.println("obj1 and obj2 is same"); // equals 오버라이딩시 출력
        }else{
            System.out.println("obj1 and obj2 is different"); // equals 오버라이딩 안했을 경우 출력, == 주소값 비교
        }
    }

    public void printHashCode(){
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");

        Set<MemberDTO> members = new HashSet<>();
        members.add(obj1);
        members.add(obj2);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println("set의 size : "+ members.size()); // hashCode 오버라이딩 x : 중복 데이터 저장됨
    }
}
