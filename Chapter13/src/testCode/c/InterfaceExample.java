package testCode.c;

import testCode.c.service.MemberManager;
import testCode.c.service.MemberManagerImpl;

public class InterfaceExample {

    public static void main(String[] args) {
        MemberManager member = new MemberManagerImpl();
    }
}
