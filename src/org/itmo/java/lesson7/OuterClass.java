package org.itmo.java.lesson7;

/*
 * Принципи солид (работают все вместе)
 * Принцип единственной ответственности - для каждого класса единственное назначение single responsibility
 * Принцип открытости и закрытости - сущности д.б. открыты для расширения но закрыты для модификации
 * Принцип подстановки ласков - принципы подстановки барбары лисков
 * Принцип разделения интерфейсов - сущности не должны зависеть от интерфейсов, которые они используют
 * Принцип инверсии зависимостей - модули высших уровеней должны зависеть от низжих. Оба должны зависеть от пбстракций
 *
 *
 * Вложенный класс используется только внутри класса где его объявили
 */
public class OuterClass {
    private int a = 2;
    private int b = 3;

    static String name = "Mike";

    void sum(final int x, final int y) {
        this.a = x;
        this.b = y;

//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
//        innerClass.display();
    }

    class InnerClass {
        void display() {
            sum(4, 6);
            System.out.println("sum = " + (a + b));
        }
    }

    public static void main(String[] args) {
        OuterClass.NestedSteticClass nestedSteticClass = new OuterClass.NestedSteticClass();
        nestedSteticClass.methodNestedStaticClass();

        OuterClass outerClass = new OuterClass();
        outerClass.innerMethod();
    }

    public void innerMethod() {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.display();
    }
    static class NestedSteticClass {
        void methodNestedStaticClass() {
            System.out.println("Static nested");
            System.out.println(name);
        }
    }
}
