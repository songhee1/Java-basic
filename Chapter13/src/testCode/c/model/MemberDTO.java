package testCode.c.model;

import java.util.Objects;

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

    public MemberDTO() {
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
            "name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberDTO memberDTO = (MemberDTO) o;
        return Objects.equals(name, memberDTO.name) && Objects.equals(phone,
            memberDTO.phone) && Objects.equals(email, memberDTO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }
}
