package org.itmo.java.lesson6;

public class Parent {
    String field;
    public void print() {
        System.out.println("Method from " + this.getClass().getSimpleName() + " class");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "field='" + field + '\'' +
                '}';
    }

}
