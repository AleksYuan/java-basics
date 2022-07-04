package org.itmo.java.lesson6.HW6.task2;

public class Truck extends Car {
    public byte wheelsCount;
    public Integer maxWeight;

    public void newWheels(byte wheels) {
        this.wheelsCount = wheels;
        System.out.println(wheels);
    }

    public Truck(int w, String m, char c, float s, byte wheelsCount, Integer maxWeight) {
        super(w, m, c, s);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }

}
