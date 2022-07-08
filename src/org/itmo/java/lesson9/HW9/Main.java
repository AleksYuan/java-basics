package org.itmo.java.lesson9.HW9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add((int) (i * Math.random() * 10));
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                list2.add(j);
            }
        }

        System.out.println(list);
        System.out.println(setMethod(list));

        System.out.println(list2);
        System.out.println(setMethod(list2));
    }



    public static List<Integer> setMethod(List<Integer> list) {
        Set<Integer> set = new TreeSet<>();
        for (Object obj : list) {
            set.add((Integer) obj);
        }

        List<Integer> res = new ArrayList<>();
        for (Integer str : set) {
            res.add(str);
        }
        return res;
    }





//    public static addInArray

}
