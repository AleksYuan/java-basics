package org.itmo.java.lesson6.HW6.task4;
import java.util.Scanner;

public class Flat {
    public Integer area;
    public short lenght;
    public short width;
    public Integer someVariable;

    {
        Scanner in = new Scanner(System.in);
        someVariable = in.nextInt();
    }
    public Flat(Integer area, short lenght, short width) {
        this.area = area;
        this.lenght = lenght;
        this.width = width;
    }

    public Flat(Integer area) {
        this.area = area;
    }


}
