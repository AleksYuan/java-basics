package org.itmo.java.lesson7.HW7;

public class Main {
    public static void main(String[] args) {
        AirPlane airPlane1 = new AirPlane("Самолет", 10000, 2000);
        AirPlane airPlane2 = new AirPlane("Кукурузник",5000, 2000);

        System.out.println(airPlane1);
        System.out.println(airPlane2);
    }
}
