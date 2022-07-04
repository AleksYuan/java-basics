package org.itmo.java.lesson6.HW6.task1;

public class Client extends Human{
    public String titleBank;

    public Client(String name, String female) {
        super(name, female);
    }

    @Override
    String getAllInfo() {
        StringBuilder allInfo = new StringBuilder();
        return allInfo.append(this.name).append(" ").append(this.female).toString();
    }
}
