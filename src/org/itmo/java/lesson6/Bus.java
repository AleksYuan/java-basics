package org.itmo.java.lesson6;

public class Bus implements Moveable{

    @Override
    public void printTransportInfo() {
        System.out.println(transportName());
    }

    @Override
    public String transportName() {
        return "Scania";
    }
}
