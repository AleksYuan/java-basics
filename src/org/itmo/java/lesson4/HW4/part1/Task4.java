package org.itmo.java.lesson4.HW4.part1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Integer num1 = num.nextInt();
        System.out.print("Введите второе число: ");
        Integer num2 = num.nextInt();
        System.out.print("Введите третье число: ");
        Integer num3 = num.nextInt();
        if (num2 > num1 && num3 > num2) {
            System.out.println("Результат: true");
        } else {
            System.out.println("Результат: false");
        }
    }
}
