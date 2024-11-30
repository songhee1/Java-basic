package testCode.inheritance;

public class ToStringOverriding {

    public static void main(String[] args) {
        ToStringOverriding thisObject = new ToStringOverriding();
        thisObject.toStringMethod(thisObject);

        MemberDTO dto = new MemberDTO("Sangmin", "010xxxxxxxx", "javatuning@gmail.com");
        System.out.println(dto); // toString() overriding
    }

    private void toStringMethod(Object obj) {
        System.out.println(obj); //ToStringOverriding class
        System.out.println(obj.toString()); //ToStringOverriding class
        System.out.println("plus "+obj); //plus ToStringOverriding class
    }

    @Override
    public String toString() {
        return "ToStringOverriding class";
    }
}
