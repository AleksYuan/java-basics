package org.itmo.java.lesson6.HW6.task5;

public class SecondUser extends User {

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setName() {
        System.out.print("Введите имя пользователя: ");
        this.name = getSmth() ;
    }
}
