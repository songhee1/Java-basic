package testCode.c.util;

import javax.lang.model.type.ReferenceType;
import testCode.c.model.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto  = new MemberDTO(); // 인스턴스변수에 final : 초기화, 선언필요

    public static void main(String[] args) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }
    public void checkDTO(){
        System.out.println(dto);
//        dto = new MemberDTO(); 참조자료형 인스턴스변수도 final 선언, 재할당 불가
    }
}
