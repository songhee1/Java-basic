package testCode.inheritance;

public class ToStringNotOverriding {

    public static void main(String[] args) {
        ToStringNotOverriding thisObject = new ToStringNotOverriding();
        thisObject.toStringMethod(thisObject);
        thisObject.toStringMethod2(thisObject);

        MemberDTO dto = new MemberDTO("Sangmin", "010xxxxxxxx", "javatuning@gmail.com");
        System.out.println("Name = "+dto.name+", phone = "+dto.phone+", email = "+dto.email); // toString() overriding x
    }

    private void toStringMethod(Object obj) { // toString() 호출 : System.out.println()매개변수, 객체 더하기 연산
        System.out.println(obj); // getClass().getName()@hascode값
        System.out.println(obj.toString()); // getClass().getName()@hascode값
        System.out.println("plus "+obj); // plus getClass().getName()@hascode값
    }
    private void toStringMethod2(Object obj) { // 자신의 객체에 대한 참조시 this 변경가능
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus "+this);
    }
}
