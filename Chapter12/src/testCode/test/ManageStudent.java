package testCode.test;

public class ManageStudent {

    public static void main(String[] args) {
        ManageStudent manage = new ManageStudent();
        manage.checkEquals(); // equal
    }
    public void checkEquals(){
        Student a = new Student("Min", "Seoul", "010xxxxxxxx", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "010xxxxxxxx", "ask@godofjava.com");

        if(a.equals(b)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
