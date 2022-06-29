package org.itmo.java.lesson5;
/* строки и методы с ними
 * switch 19-15
 * склеивание строк и цифр 19-28
 * методы для строк 19-30
 * чар 19-50
 * стрингбилдер будет
 * стрингбаффер потокобезопасный, стрингбилдер работает быстрее
 * посчти всегда работают с стрингбилдером
 */

public class Lesson5 {
    public static void main(String[] args) {
        String java = "Java";

        String s = java.toLowerCase();

//        System.out.println(s);
//
//        String java2 = new String("JaVa");
//
//        System.out.println(java == java2);
//        System.out.println(java.equals(java2));
//        System.out.println(java.equalsIgnoreCase(java2));


//        java = java.concat(" Developer");
//        System.out.println(java);


//        java = java + 123;
//        System.out.println(java);
//
//        java = 80 + 120 + java + (140 + 160);
//        System.out.println(java);


//        int length = java.length();
//
//        boolean empty = java.isEmpty();
////        String s = "";

//        System.out.println(java.substring(2));
//        System.out.println(java.substring(2, 6));

//        String string = " Hello world!  ";
//        System.out.println(string);
//        System.out.println(string.trim());
//
//        System.out.println(string.replaceAll("l", "5"));

        String text = "Норвегия отказалась пропускать грузы для российских поселений на Шпицбергене";
//
//        String[] strings = text.split(" ");
//        for (String str : strings) {
//            System.out.println(str);
//        }

        Integer number = 12312417;

//        String str = String.valueOf(number);
//        System.out.println(str);
//
//        char[] chars = str.toCharArray();
//        for (char aChar : chars) {
//            if (Character.isDigit(aChar)) {
//                System.out.println("true");
//            }
//        }


        StringBuilder builder = new StringBuilder(); // was text
        StringBuilder builder2 = new StringBuilder(text);
        System.out.println(builder);

//        System.out.println(text == builder.toString());
//        System.out.println(builder == builder2);
//        System.out.println(builder.equals(builder2));
//        System.out.println(text.equals(builder.toString()));
//        System.out.println(text.equals(builder));


        for (String str1 : text.split(" ")) {
            builder.append(str1)
                    .append(", ");
        }

        String string = builder.toString();

        System.out.println(builder);

        String tring = builder.reverse().toString();
        System.out.println(tring);
/*
        builder.insert(3, "MOSCOW");

        System.out.println(builder);


        StringBuffer buffer = new StringBuffer();


        String s = "Мне бяка по-настоящему нравиться больше чего-либо в разработке ПО делать фреймворки, Бяка позволяющие другим разработчикам создавать что-то крутое. БЯКА Иногда, в погоне за идеальным кодом, ко мне на ум приходят странные идеи, но бякАпри реализации который C# может дойти до предела своих возможностей.\n" +
                "Не так давно произБякаошёл подобный случайБяКа, когда БЯКА и мы вместе с коллегой искали способ избежать передачи большого количества типовых параметров в тех местах, где компилятор должен был по идее их вывести. Однако бяКа , C# так устроен, что способен выводить типы в обобщённых вызовах только из передаваемых параметров метода.";

        System.out.println(s);
        String word = "бяка";
        System.out.println(replaceWord(s, word));
    }

    private static String replaceWord(String text, String word) {
        StringBuilder builder = new StringBuilder();
        String str = "[censored]";
        for (String s : text.split(" ")) {
            if (s.equalsIgnoreCase(word)) {

                builder.append(str);

            } else if (s.toLowerCase().contains(word.toLowerCase())) {
                int beginIndex = s.toLowerCase().indexOf(word.toLowerCase());
                String substring = s.substring(beginIndex, word.length() + beginIndex);
                String s1 = s.replaceAll(substring, str);
                builder.append(s1);

            } else {
                builder.append(s);
            }

            builder.append(" ");
        }

        return builder.toString();


 */
    }
}

