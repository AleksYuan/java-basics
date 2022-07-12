package org.itmo.java.lesson10;

import org.itmo.java.lesson10.HW10.Text;
import java.io.FileNotFoundException;

public interface Service {
    Text create(String path);
    void readText(Text text) throws FileNotFoundException;
    void addText(Text text1, Text text2, Boolean addReplace);
    void replace(Text text, Text text2, String sight);
}
