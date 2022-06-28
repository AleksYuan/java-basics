package org.itmo.java.lesson4.HW4;

public class Task2DivisionThreeFive {
    public static void main(String[] args) {
        String three = "Делится на 3: ";
        String five = "Делится на 5: ";
        String threeAndFive = "Делится на 3 и на 5: ";
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                threeAndFive += Integer.toString(i) + ", ";
            } else if (i % 3 == 0) {
                three += Integer.toString(i) + ", ";
            } else if (i % 5 == 0) {
                five += Integer.toString(i) + ", ";
            }
        }
        System.out.println(three.substring(0, three.length() - 2));
        System.out.println(five.substring(0, five.length() - 2));
        System.out.println(threeAndFive.substring(0,threeAndFive.length() - 2));
    }
}
