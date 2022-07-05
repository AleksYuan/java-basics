package org.itmo.java.lesson6;

public class Plain extends Transport {

    public Plain(Integer weight, Integer seatPlace, Boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    void abstractMethod() {
        System.out.println("absMethod");
    }

    @Override
    public void printTransportInfo() {

    }

    @Override
    public String transportName() {
        return null;
    }

//    @Override
//    void abstractMethod() {
//
//    }

}
