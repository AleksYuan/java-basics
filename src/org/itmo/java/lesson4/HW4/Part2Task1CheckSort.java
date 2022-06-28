package org.itmo.java.lesson4.HW4;

public class Part2Task1CheckSort {
    public static void main(String[] args) {
        int[] arr1 = {0, 15, 1, 4, 6, 2, -17};
        int[] arr2 = {0, 1, 2, 3, 4};
        System.out.println(sortedArray(arr1));
        System.out.println(sortedArray(arr2));

    }

    public static String sortedArray(int[] array) {
        String a = "OK";
        if (array.length > 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                } else {
                    a = "Please, try again";
                    break;
                }
            }
        }
        return a;
    }
}