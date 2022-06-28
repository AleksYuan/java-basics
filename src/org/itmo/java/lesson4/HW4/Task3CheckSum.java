package org.itmo.java.lesson4.HW4;
import java.util.Scanner;
public class Task3CheckSum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Integer num1 = num.nextInt();
        System.out.print("Введите второе число: ");
        Integer num2 = num.nextInt();
        System.out.print("Введите третье число: ");
        Integer sumOfNum = num.nextInt();
        if (num1 + num2 == sumOfNum) {
            System.out.println("Результат: true");
        } else {
            System.out.println("Результат: false");
        }
    }
}
