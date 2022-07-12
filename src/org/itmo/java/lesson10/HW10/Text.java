package org.itmo.java.lesson10.HW10;

public class Text {
    String path;

    public Text(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Text{" +
                "path='" + path + '\'' +
                '}';
    }
}
