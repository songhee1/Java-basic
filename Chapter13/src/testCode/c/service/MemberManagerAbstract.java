package testCode.c.service;

import testCode.c.model.MemberDTO;

public abstract class MemberManagerAbstract {
    public abstract boolean addManager(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDTO member);
    public void printLog(String data){
        System.out.println("Data = "+data);
    }
}
