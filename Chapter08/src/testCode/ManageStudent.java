package testCode;

public class ManageStudent {

    public static void main(String[] args) {
        ManageStudent ms = new ManageStudent();
        Student[] students = null;
        students = ms.addStudent();
        for(Student s : students){
            ms.printStudents(s);
        }
    }
    public Student[] addStudent(){
        Student student[] = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("sook", "seoul", "010xxxx", "ask@java.com");
        return student;
    }
    public void printStudents(Student student){
        System.out.println(student);
    }
}
