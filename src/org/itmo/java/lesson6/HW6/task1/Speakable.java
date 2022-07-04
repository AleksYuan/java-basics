package org.itmo.java.lesson6.HW6.task1;

public interface Speakable {
    String speak = "can speak";

     static void speakAble() {
        System.out.println("able to speak");
    }

    default void canSpeak() {
        System.out.println(this.getClass().getSimpleName() +  " " + speak);
    }
}
