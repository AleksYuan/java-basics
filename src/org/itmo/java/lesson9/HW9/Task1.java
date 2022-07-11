package org.itmo.java.lesson9.HW9;

import java.util.*;

public class Task1 {

//    Наполняем коллекцию рондомами
    public static List addDataRandom(List list, Integer count) {
        for (int i = 0; i < count; i++) {
            list.add((int) (i * Math.random() * 5));
        }
        return list;
    }

//    наполняем коллекцию упорядоченным списком
    public static List addDataToRepeat(List list ,Integer count, Integer repeat) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < repeat; j++) {
                list.add(j);
            }
        }
        return list;
    }

//    сетуем и переносим (можно вывести коллекцию, можно переоформить в лист. Смотря что нужно на выходе
    public static List setMethod(List list) {
        Set<Object> set = new TreeSet<>();
        for (Object obj : list) {
            set.add(obj);
        }

//        List<Object> res = new ArrayList<>();
        list.clear();
        for (Object str : set) {
            list.add(str);
        }
        return list;
    }
}
