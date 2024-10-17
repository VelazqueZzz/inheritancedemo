package org.example;

import java.util.Scanner;

abstract class Member {
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberId;
    private int memberSince;
    private int discount;

    public Member() {
        System.out.println("Parent Constructor with no parameter");

    }

    public Member(String pName, int pMemberId, int pMemberSince) {
        System.out.println("Parent constructor with 3 parameter");
        name = pName;
        memberId = pMemberId;
        memberSince = pMemberSince;

    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(){
        Scanner input = new Scanner(System.in);
        String password;
        System.out.println("Please enter the admin password: ");
        password = input.nextLine();
        if(!password.equals("abcd")){
            System.out.println("Password is incorrect");
        }
        else{
            System.out.println("please enter the discount: ");
            discount = input.nextInt();
        }

    }
    public void displayMemInfo(){
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    }
   abstract public void calculateAnnualFee();
}
