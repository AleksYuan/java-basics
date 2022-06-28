package org.itmo.java.lesson4.HW4;
import java.util.Arrays;
import java.util.Scanner;

public class Part2Task23NewArray {
    public static void main(String[] args) {
        int[] array1 = arr();
        System.out.println(Arrays.toString(array1));
        System.out.println(uniqueNumber(array1));
        System.out.println(Arrays.toString(changeArr(array1)));

    }

    private static int[] arr() {
        Scanner num = new Scanner(System.in);
        int arrCount = num.nextInt();

        if (arrCount < 1) {
            System.out.println("Введите другое число");
            return (arr());
        } else {
            int[] myArray = new int[arrCount];
            for (int i = 0; i < arrCount; i++) {
                myArray[i] = num.nextInt();
            }
            return myArray;
        }
    }

    private static int[] changeArr(int[] array) {
        int a = array[0];
        int leng = array.length - 1;
        array[0] = array[leng];
        array[leng] = a;
        return array;
    }


    private static int uniqueNumber(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count += 1;
                }
            }
            if (count == 1) {
                res = array[i];
                break;
            }
        } return res;
    }
}