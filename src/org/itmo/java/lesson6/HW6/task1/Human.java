package org.itmo.java.lesson6.HW6.task1;
import java.util.Scanner;

public abstract class Human implements Speakable {
    protected String name;
    protected String female;
    Scanner in = new Scanner(System.in);


    abstract  String getAllInfo();

    protected Human(String name, String female) {
        this.name = name;
        this.female = female;
    }

    public String writeSmth() {
        return in.nextLine();
    }

    @Override
    public void saySpeech() {
        System.out.println(this.getClass().getSimpleName() + " say that: ");
        System.out.println(writeSmth());;
    }
}

