package org.example;

public class Main {
    public static void main(String[] args) {

//        NormalMember mem1 = new NormalMember("James",1,2010);
//        VIPMember mem2 = new VIPMember("Andy",2,2013);
//        mem1.setDiscount();
//        mem1.calculateAnnualFee();
//     //   mem2.calculateAnnualFee();
//
//        mem1.displayMemInfo();
//       // mem2.displaayMemInfo();
        //}

        Member[] clubMembers = new Member[6];
        clubMembers[0]= new NormalMember("James",1,2010);
        clubMembers[1]= new NormalMember("Joe",2,2011);
        clubMembers[2]= new NormalMember("Jack",3,2012);
        clubMembers[3]= new VIPMember("Bill",4,2012);
        clubMembers[4]= new VIPMember("Nick",5,2011);
        clubMembers[5]= new VIPMember("Carol",6,2015);

        for(Member m:clubMembers){
            m.calculateAnnualFee();
            m.displayMemInfo();
        }
    }
}