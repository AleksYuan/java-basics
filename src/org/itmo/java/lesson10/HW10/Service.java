package org.itmo.java.lesson10.HW10;

public interface Service {
    Text create(String path);
    void readText(Text text);
    void addText(Text text1, Text text2, Boolean addReplace);
    void replace(Text text, Text text2, String sight);
}
