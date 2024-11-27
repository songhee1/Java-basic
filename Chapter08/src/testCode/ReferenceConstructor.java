package testCode;

public class ReferenceConstructor {

    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }
    public void makeMemberObject(){
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("member1", "member1@naver.com");
        MemberDTO dto3 = new MemberDTO("member1", "010xxxxxxxx", "member1@naver.com");
        MemberDTO dto4 = new MemberDTO("member1");
    }
}
