package org.itmo.java.lesson2.HW2;

import org.itmo.java.lesson2.Color;

public class Main {
    public static void main(String[] args) {

//        Задание 1 калькулятор
        System.out.println(Calculator.sum(10, 15));
        System.out.println(Calculator.division(20,3));

//        Задание 2 объекты
        Laptop laptop = new Laptop();
        System.out.println(laptop);
        Laptop laptop1 = new Laptop(Brand.Samsung,  15, 10000, "norm");
        System.out.println(laptop1);
        Laptop laptop2 = new Laptop(Brand.Apple, "pro", 15, Color.BLUE, 15000, false, "norm");
        System.out.println(laptop2);
        System.out.println(laptop1.getBrand());


    }

}
