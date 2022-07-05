package org.itmo.java.lesson4;
import org.itmo.java.lesson2.Car;
import org.itmo.java.lesson2.Color;

import java.util.Arrays;
import java.util.Collections;
//import org.itmo.java.lesson2.Car;

public class Lesson4 {
    /* Log
     * что такое массив 18-42
     * горячая клавиша для копирования контрл+D 18-40
     * если пишем примитивы то инициализация нулями если нет то null 18-45
     * что бы перейти в документацию контрл+наводим мышку и появляется рука 18-51
     * импорт класса правая кнопка мыши, показать контекстное меню, импорт класса 19-00
     * инкремент фор и и++ 19-05
     * итер создает для последнейго массива 19-08
     * установка плагина 19-25
     */

    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 20;
        intArray[1] = 43;
        intArray[2] = 57;
        intArray[3] = 79;
        intArray[4] = 12;
        intArray[5] = 23;
        intArray[6] = 160;

//        System.out.println(Arrays.toString((intArray)));

//        for (int i : intArray) {
//            System.out.println(i);
//        }

        String[] strings = new String[5];
//        System.out.println(Arrays.toString(strings));

        Long[] longs = new Long[]{123L, 321L, 444L};
//        System.out.println(Arrays.toString(longs));

        Car[] cars = new Car[3];
        cars[0] = new Car("Lada", "vesta", Color.BLUE, true);
        cars[1] = new Car("Lada", "vesta", Color.GREEN, true);
        cars[2] = new Car("Lada", "vesta", Color.BLACK, true);
//        System.out.println(cars[0].getBrand());

        for (int i = 0; i < longs.length; i++) {
            System.out.println(longs[i]);
        }

        for (Car car : cars) {
            if (car.getColor() == Color.BLACK) {
                continue;
            }
            System.out.println(car);
        }


        int x = 0;
//        do {
////            System.out.println(x++);
//            System.out.println(++x);
//        } while (x != 10);

        while (x != 5) {
            System.out.println(x++);
            if (x == 3) {
                break;
            }
            if (x == 2) {
                continue;
            }
        }
//        прочитать про красно черные деревья (бинарный поск в джава) 19-37
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

// бинарный поиск только после сортировки по возрастанию
        System.out.println(Arrays.binarySearch(intArray, 21));
        System.out.println(Arrays.binarySearch(intArray, 79));
        System.out.println(Arrays.binarySearch(intArray, 90));
    }
}


//        Collections.reverse(Arrays.asList(intArray));
//        System.out.println(Arrays.toString(intArray));
//        Arrays.sort(intArray, Collections.reverseOrder());

//        какой то вопрос ответ collections.revers ????


//    }

//    //        аргумент переменной длины 19-28 (либо значение либо список)
//    public static void varArgMethod (String...line){
////        System.out.println(Arrays.toString(line));
//    }
//}
