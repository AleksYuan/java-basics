package org.itmo.java.lesson6.HW6.task5;

public class Main {
    public static void main(String[] args) {
        SecondUser secondUser = new SecondUser();
        secondUser.age();
        secondUser.setAge();

        System.out.println(secondUser.age);
        System.out.println(secondUser.name);
    }
}
