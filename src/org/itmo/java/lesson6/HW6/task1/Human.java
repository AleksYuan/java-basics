package org.itmo.java.lesson6.HW6.task1;

public abstract class Human implements Speakable {
    public String name;
    public String female;

    public String getName() {
        return name;
    }

    public String getFemale() {
        return female;
    }

    abstract  String getAllInfo();

    public Human(String name, String female) {
        this.name = name;
        this.female = female;
    }
}

