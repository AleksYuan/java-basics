package org.itmo.java.lesson2;

public class CarService {
    public static long totalPrice (Car car, Integer servicePrice) {
       long totalPrice = car.getPrice() +servicePrice;
       return totalPrice;
    }
}
