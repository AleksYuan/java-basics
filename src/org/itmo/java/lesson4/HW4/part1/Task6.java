package org.itmo.java.lesson4.HW4.part1;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        Integer[] arr1 = {0, 15, 1, 4, 6, 2, -17};
        System.out.println(searchOneThree(arr1));
    }

    public static Boolean searchOneThree(Integer[] array) {
        if (Arrays.asList(array).contains(1) || Arrays.asList(array).contains(3)) {
            return true;
        } else {
            return false;
        }
    }
}
