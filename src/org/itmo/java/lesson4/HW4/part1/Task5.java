package org.itmo.java.lesson4.HW4.part1;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        Integer arr1[] = {2, 15, 2, 1, 6, 2, -17} ;
        if (arr1.length > 1) {
            System.out.println("array = " +
                    Arrays.deepToString(arr1).replace("]","").replace("[", ""));
            if (arr1[0] == 3 || arr1[arr1.length-1] == 3) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
