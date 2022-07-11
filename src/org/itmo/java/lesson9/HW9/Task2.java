package org.itmo.java.lesson9.HW9;

import java.util.List;

public class Task2 {

    public static Long getTime(List<Integer> list, Integer iter) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < iter; i++) {
            list.get((int) (Math.random() * list.size()));
        }
        long res = System.currentTimeMillis() - start;
        return res;
    }
}
