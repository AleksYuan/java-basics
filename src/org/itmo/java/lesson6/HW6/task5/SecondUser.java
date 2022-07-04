package org.itmo.java.lesson6.HW6.task5;

public class SecondUser extends User {
    public String name;

    @Override
    public void setAge() {
        System.out.print("Введите имя пользователя: ");
        this.name = getSmth();
    }

    public void age() {
        super.setAge();
    }
}
