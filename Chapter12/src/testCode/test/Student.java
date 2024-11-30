package testCode.test;

import java.util.Objects;

public class Student {
    public String name;
    public String address;
    public String phone;
    public String email;

    // equals(동일성 비교), hashcode 오버라이딩
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(address,
            student.address) && Objects.equals(phone, student.phone)
            && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phone, email);
    }

    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}
