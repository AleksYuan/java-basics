package org.itmo.java.lesson6.HW6.task1;

public class Main {
    public static void main(String[] args) {
//        Client client = new Client("Vasya", "Petkin");

        Speakable client = new Client("Vasya", "Petkin");
        Employee employee = new Employee("Oleg", "Selivanov");

        client.canSpeak();
        client.printAllData();
        client.saySpeech();

        employee.canSpeak();
        System.out.println(employee.getAllInfo());
        employee.printAllData();
    }
}
