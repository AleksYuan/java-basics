package org.itmo.java.lesson1;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lesson1 {
    public static void main(String[] args) {
        String iknowjava = "Я" + System.lineSeparator() + "хорошо" + System.lineSeparator() +
                "знаю" + System.lineSeparator() + "Java." ;
        System.out.println(iknowjava);


        double fc = (46 + 10) * (10 / 3.0);
        int sc = (29) * (4) * (-15);
        System.out.println("fc = " + fc + "; sc = " +sc);


        int number = 10500;
        double result = ((double)number/10)/10;
        System.out.println(result);


        float fa = 3.6f;
        float fb = 4.1f;
        float fc2 = 5.9f;
        float result2 =  fa * fb * fc2;
        System.out.println(result2);


        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();
        System.out.println(num + System.lineSeparator() + num2 + System.lineSeparator() +
                num3);


        int b = in.nextInt();
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }


//    byte b = 100;
//    short s = 123;
//    int i = 500;
//    long l = 50000000000L;
//    float f = 12.3f;
//    double d = 14.5d;
//
//    char c = 'a';
//    boolean isTrue = true;
//
//    int r = b + i;
////    System.out.println(r);
//
//    long q = b + i;
//    System.out.println(r);
//
//    double i1 = (double) i / 3;
//    System.out.println(i1);
//
//    String string = "Java";
//    String str = new String("strJava");
//    System.out.println(str);
//
//    if (true)   {
////        logic
//    } else {
////        logic
//    }
    }

}


