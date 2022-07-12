package org.itmo.java.lesson10.HW10;


import org.itmo.java.lesson10.service.ServiseText;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Service service = new ServiseText();
        Text text =  service.create("files/text.txt");

        service.readText(text);

        Text text2 = service.create("files/task2.txt");
        Text text3 = service.create("files/task2-3");
        service.addText(text, text2, false);
        service.addText(text, text3, false);
        service.addText(text, text3, true);

        Text text4 = service.create("files/task4.txt");
        service.replace(text, text4, "$");

    }
}
