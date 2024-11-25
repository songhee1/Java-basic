package testCode;

public class ProfilePrint {
    private byte age;
    private String name;
    private boolean isMarried;
    public void setAge(byte age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMarried(boolean flag){
        this.isMarried = flag;
    }
    public boolean isMarried(){
        return isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint pp = new ProfilePrint();
        pp.setAge((byte) 10);
        pp.setName("variable");
        pp.setMarried(true);
        System.out.println(pp.getAge());
        System.out.println(pp.isMarried());
        System.out.println(pp.getName());
    }
}
