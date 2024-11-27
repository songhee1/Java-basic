package testCode;

public class MemberDTO {
    private String name;
    private String phone;
    private String email;

    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public MemberDTO(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public MemberDTO(String name) {
        this.name = name;
    }
    /*public MemberDTO(String phone){ // 불가

    }*/

    public MemberDTO() {
    }

    public static void main(String[] args) {

    }
}
