package org.example;

public class NormalMember extends Member {
    public NormalMember(){
        System.out.println("Child constructor with no parameter");
    }
    public NormalMember(String pName, int pMemberId, int pMemberSince){
        super(pName, pMemberId, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }
}
