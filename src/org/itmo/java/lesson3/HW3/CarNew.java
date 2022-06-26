package org.itmo.java.lesson3.HW3;
public class CarNew {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("blue");
        Car car3 = new Car("white", 1300);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}

