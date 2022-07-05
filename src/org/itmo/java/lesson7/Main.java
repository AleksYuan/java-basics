package org.itmo.java.lesson7;

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedSteticClass nestedSteticClass = new OuterClass.NestedSteticClass();
        nestedSteticClass.methodNestedStaticClass();

        SomeClass someClass = new SomeClass() {
            @Override
            public void print() {
                System.out.println(name());
            }

            @Override
            public String name() {
                return "interface";
            }

        };

        someClass.print();
    }
}
