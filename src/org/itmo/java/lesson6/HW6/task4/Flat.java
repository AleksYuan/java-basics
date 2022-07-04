package org.itmo.java.lesson6.HW6.task4;
import java.util.Scanner;

public class Flat {
    protected Integer area;
    protected short lenght;
    protected short width;
    protected Integer someVariable;
    Scanner in = new Scanner(System.in);


    public Flat(Integer area, short lenght, short width) {
        this.area = area;
        this.lenght = lenght;
        this.width = width;
    }


    public void setSomeVariable() {
        System.out.println("Write some integer: ");
        this.someVariable = in.nextInt();
    }

    public void setSomeVariable(Integer someVariable) {
        this.someVariable = someVariable;
    }

    public Integer getSomeVariable() {
        return someVariable;
    }
}
