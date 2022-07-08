package org.itmo.java.lesson9;

//import javax.sound.midi.Soundbank;
import java.util.*;

//  Коллекции
public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add("String");
        list.add(true);

        System.out.println(list);

        List<String> strings = new ArrayList<>();
        strings.add("1234");
        strings.add("string");
        strings.add("false");
        System.out.println(strings);
//        strings.add(123);
//        strings.add(true);

        Collections.sort(strings);
        System.out.println(strings);

        Collections.reverse(strings);
        System.out.println(strings);

        List<Integer> integers = new ArrayList<>();
        integers.add(1234);
        integers.add(1234);
        integers.add(1234);
        integers.add(1234);
        integers.add(12345);
        integers.add(123456);
        integers.add(123456);
        integers.add(123456);
        integers.add(123456);
        integers.add(1234567);
        integers.add(1234555);
        integers.add(1234555);
        integers.add(1234555);
        integers.add(1234555);

// неизменяемый лист, нельзя вносить изменять или удалять. Можно только читать список
        List<Integer> integers1 = Arrays.asList(213, 431, 34);
//        integers1.add(1234);

//        for (Integer integer : integers) {        //   <- удаление по условию не возможно
//            if (integer > 123456) {
//                integers.remove(integer);
//            }
//        }

//        System.out.println(integers);
//        Iterator<Integer> iterator = integers.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() > 123456) {
//                iterator.remove();
//            }
//        }
//        System.out.println(integers);

//        for (int i = 0; i < integers.size(); i++) {
//            System.out.println(integers.get(i));
//        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add("Java");
        }

        System.out.println(set);

        set.add("String");
        set.add("777");
        set.add("world");
        set.add("Hello");

        System.out.println(set);

        Set<Integer> integerSet = new TreeSet<>(integers);
        System.out.println(integerSet);

        // key      value
        Map<String, Integer> map = new HashMap<>();

        map.put("Joe", 123456);
        map.put("Vanya", 5344652);
        map.put("Katie", 123456);
        map.put("Bob", 123908);
        map.put("Mike", 2340987);
//        map.put("Mike", 777);

        System.out.println(map);

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();

        System.out.println(keys);
        System.out.println(values);

        Integer integer = map.get("Joe");
        System.out.println(integer);

        System.out.println( getKeyByValue(map, 2340987));



    }

    public static void method (List<String> strings) {

    }


    public static String getKeyByValue(Map<String, Integer> map, Integer value) {
        String result = null;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer mapValue = pair.getValue();

            if(value.equals(mapValue)) {
                result = key;
            }
        }
        return result;
    }
}
