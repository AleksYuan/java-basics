package org.itmo.java.lesson6;
//import org.itmo.java.lesson2.Car;

import java.lang.reflect.Field;

/*  ООП урок 6
 * наследование
 * инкапсуляция - сокрытие данных (рефлексия нарушает принцип инкапс. Можно обойти)
 * полиморфизм -
 * абстракция (не все включают в список ооп)
 *
 * как посмотреть приватные методы или посмотреть инкапсулированные методы в другом классе 19-40
!!! * методы хэш код и иквелс ?? что это и надо прочитать
 * оверрайт метод 20-00
 * нельзя преобразовать тип родительского класса 20-08
 * ссылочки с метода от метода до метода 20-10
 *
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();

//        Field[] declaredFields = car.getClass().getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }


        Object object = new Object();


        Parent parent = new Parent();
        Parent parent2 = new Child();
        Parent parent3 = new AnotherChild();

        System.out.println(parent(parent));
        System.out.println(parent(parent2));
        System.out.println(parent(parent3));


//        Child child = new Parent() - создание невозможно

//        ((Child)parent).print(); - нельзя вызвать метод родителя через наследника
//        ((Parent)parent2).print()

        Moveable scania = new Bus();
        Moveable volvo = new Car();

        printTransportInfo(scania);
        printTransportInfo(volvo);

    }

    public static Parent parent(Parent parent) {
        return parent;
    }

    public static void  printTransportInfo(Moveable transport) {
        transport.printTransportInfo();
    }
}
