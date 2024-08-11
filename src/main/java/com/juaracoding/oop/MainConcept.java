package com.juaracoding.oop;

import com.juaracoding.Manager;

public class MainConcept {
    public static void main(String[] args) {
        //Encapsulation
        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("password");
        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());

        User staff = new User();
        staff.setUsername("staff");
        staff.setPassword("password");
        System.out.println(staff.getUsername());
        System.out.println(staff.getPassword());

        staff.setCurrentPassword("password");
        staff.setNewPassword("081234");
        staff.setConfirmPassword("081234");
        staff.changePassword(staff.getCurrentPassword(),staff.getNewPassword(),staff.getConfirmPassword());

        //Polymorphisme Overloading
        Calculator calculator = new Calculator();
        calculator.sum(2,3);
        calculator.sum(2.5,3.5);

        //Polymorphisme Overriding
//        BidangDatar b = new BidangDatar();
//        BidangDatar c = new Segitiga();
//        b.draw();
//        c.draw();
        //Polymorphisme Overriding
        BidangDatar bidangDatar = new BidangDatar();
        bidangDatar.draw();
        BidangDatar segitiga = new Segitiga();
        segitiga.draw();

        //Inheritance
        Manager manager1 = new Manager();
        manager1.name = "Name";
        manager1.department = "QA";
        System.out.println(manager1.name);
        System.out.println(manager1.department);

        //C



    }
}
