package org.itmo.java.lesson6.HW6.task1;

public class Employee extends Human {
    public String titleBank;

    public Employee(String name, String female) {
        super(name, female);
    }

    @Override
    String getAllInfo() {
        StringBuilder allInfo = new StringBuilder();
        return allInfo.append(this.name).append(" ").append(this.female).toString();
    }


}
