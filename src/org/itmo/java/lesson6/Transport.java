package org.itmo.java.lesson6;

public abstract class Transport implements Moveable {
    private Integer weight;
    private Integer seatPlace;
    private Boolean isFlying;

    public Transport(Integer weight, Integer seatPlace, Boolean isFlying) {
        this.weight = weight;
        this.seatPlace = seatPlace;
        this.isFlying = isFlying;
    }

    abstract void abstractMethod();

    public void info() {
//        logic
    }

}
