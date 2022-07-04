package org.itmo.java.lesson6.HW6.task2;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и ее скорость - " + speed);
    }

    public Car(int w, String m, char c, float s) {
        this.weight = w;
        this.model = m;
        this.color  = c;
        this.speed = s;
    }

    public Car() {

    }


}
