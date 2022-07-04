package org.itmo.java.lesson6.HW6.task5;
import java.util.Scanner;

public abstract class User {
    protected Short age;
    protected String name;
    Scanner in = new Scanner(System.in);
    public abstract void setName();

    protected User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getSmth() {
        return in.nextLine();
    }


    public void setAge() {
        System.out.print("Введите возраст пользователя: ");
        Short ages = Short.parseShort(getSmth());
        if (ages < 0) {
            ages = 0;
        }
        this.age = ages;
    }

}
