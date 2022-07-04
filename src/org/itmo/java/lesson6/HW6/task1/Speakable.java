package org.itmo.java.lesson6.HW6.task1;

public interface Speakable {
    String SPEAK = "can speak";
    void printAllData();
    void saySpeech();

    default void canSpeak() {
        System.out.println(this.getClass().getSimpleName() +  " " + SPEAK);
    }
}
