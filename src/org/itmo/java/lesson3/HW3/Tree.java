package org.itmo.java.lesson3.HW3;

public class Tree {
    private Boolean isAlive;
    private Integer age;
    private String name;

    public Tree (Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree (Boolean isAlive, Integer age, String name) {
        this.isAlive = isAlive;
        this.age = age;
        this.name = name;
    }

    public Tree () {
        System.out.println("Пустой конструктоа без параметров сработал");
    }
}
