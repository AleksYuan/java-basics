package org.itmo.java.lesson6.HW6.task5;
import java.util.Scanner;

public class User {
    public Short age;

    public User() {
    }

    public String getSmth() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

//    public Short getAge() {
//        return age;
//    }
//
    public void setAge() {
         System.out.print("Введите возраст пользователя: ");
         Short age = Short.parseShort(getSmth());
        this.age = age;
    }
}
