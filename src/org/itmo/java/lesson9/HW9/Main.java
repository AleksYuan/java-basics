package org.itmo.java.lesson9.HW9;

import org.itmo.java.lesson9.HW9.Task3.service.ServiceUser;
import org.itmo.java.lesson9.HW9.Task3.service.impl.ServiceImpl;

import java.util.*;


public class Main {
    public static void main(String[] args) {
//        Задание 1
        List<Object> list = new ArrayList<>();
        Task1.addDataRandom(list, 40);

        System.out.println(list);
        System.out.println(Task1.setMethod(list));

        List<Object> list2 = new ArrayList<>();
        Task1.addDataToRepeat(list2, 3, 10);

        System.out.println(list2);
        System.out.println(Task1.setMethod(list2));



//        Задание 2
        List<Object> list21 = new ArrayList<>(1000000);
        Task1.addDataRandom(list21, 1000000);
        System.out.println(Task2.getTime(list21, 100000));

        List<Object> list22 = new LinkedList<>(list21);
        System.out.println(Task2.getTime(list22, 1000)); // конечно можно цифру и поменьше поставить

//        Задание 3


        ServiceUser serviceUser = new ServiceImpl();

        Map<String, Integer> map = new HashMap<>();

        map.put("Joe", 123456);
        map.put("Vanya", 5344652);
        map.put("Katie", 123456);
        map.put("Bob", 123908);
        map.put("Mike", 2340987);

        serviceUser.download(map);
        System.out.println();

        System.out.println(serviceUser.create("OlyaOlya", 100));

        Scanner scan = new Scanner(System.in);
        String find = scan.nextLine();
        System.out.println("Количество очков юзера " + find + ": " + serviceUser.get(find));
    }

}

