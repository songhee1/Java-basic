package testCode.c.service;

import testCode.c.model.MemberDTO;

public interface MemberManager {
    public boolean addManager(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
