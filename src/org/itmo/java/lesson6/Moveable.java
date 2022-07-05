package org.itmo.java.lesson6;


/*
 * интерфейсы для задания методов поведения
 *
 */
public interface Moveable {
    public static final String NAME = "brand";
    public abstract void printTransportInfo();
    String transportName();

    default void someMethod() {
        System.out.println("someMethod");
    }

    public static void staticMethod() {
//        logic
    }


}
