package testCode;

public class ReferenceStaticVariable {
    static String name;
    public ReferenceStaticVariable(){}
    public ReferenceStaticVariable(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        ReferenceStaticVariable rs = new ReferenceStaticVariable();
        rs.checkName();
    }
    public void checkName(){
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Sangmin");
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("Sungchoon");
        System.out.println(reference1.name); // Sungchoon
    }
}
