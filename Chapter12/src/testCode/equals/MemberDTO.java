package testCode.equals;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public MemberDTO(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
            "name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            '}';
    }

  /* @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }*/
}
