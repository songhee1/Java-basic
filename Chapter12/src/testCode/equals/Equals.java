package testCode.equals;

public class Equals {

    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMethod();
        thisObject.equalMethod2();
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

        if(obj1.equals(obj2)){ // hashCode()(주소값) 비교
            System.out.println("obj1 and obj2 is same");
        }else{
            System.out.println("obj1 and obj2 is different"); // 출력
        }
    }
}
