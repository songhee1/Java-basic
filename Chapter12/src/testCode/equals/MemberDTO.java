package testCode.equals;

import c.inheritance.Student;

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

  @Override
    public boolean equals(Object obj) {
       if (this == obj) return true; // 참조값이 같은 경우 true 리턴
       if (obj == null || getClass() != obj.getClass()) return false; // 비교하는 객체가 null이거나 클래스 불일치 시 false 리턴

       MemberDTO other = (MemberDTO) obj;
       if(name == null){
           if(other.name != null) return false;
       }else if(!name.equals(other.name)) return false;

       if(phone == null){
          if(other.phone != null) return false;
      }else if(!phone.equals(other.phone)) return false;

       if(email == null){
          if(other.email != null) return false;
      }else if(!email.equals(other.email)) return false;

       return true;

  }

    @Override
    public int hashCode() { // equals 오버라이딩시 함께 오버라이딩
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());

        return result;
    }
}
