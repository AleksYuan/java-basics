package org.itmo.java.lesson5.HW5;

public class Tasks {
    public static void main(String[] args) {
        String ns = "Привет, бякАкак твои дела, БЯКа так давнJJJо не RвиделJись бяка, Бяка MMM БЯка ";
        String pw = "Шалаш";
        String rs = "This is Russia really";
        System.out.println(lengthOfLine(ns));
        System.out.println(polindromWord(pw));
        System.out.println(changeByaka(ns));
        System.out.println(countStrToStr(ns, "бяка"));
        System.out.println(changeByakaAll(ns, "бяка", "[нецензурная брань]"));
        System.out.println(reverseWordsInStrBuilder(rs));

    }

//    задание 1 - Написать метод для поиска самого длинного слова в тексте.
    private static String lengthOfLine(String line) {
        String[] lineMass = line.split(" ");
        String res = lineMass[0];
        for (int i = 0; i < lineMass.length - 1; i++) {
            if (lineMass[i].length() < lineMass[i + 1].length()) {
                res = lineMass[i + 1];
            }
        }
        return res;
    }

//    задание 2 - Написать метод, который проверяет является ли слово палиндромом.
    private static Boolean polindromWord(String line) {
        boolean count = true;
        String sl = line.trim().toLowerCase();
        for (int i = 0; i < line.length() / 2 ; i++) {
//            System.out.println(line.toLowerCase().charAt(i));
            if ( sl.charAt(i) != sl.charAt(line.length() -1 - i) ) {
                count = false;
            }
        }
        return count;
    }

//    MVP
//    задание 3 - Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
    private static String changeByaka(String line) {
        return line.toLowerCase().replace("бяка", "[нецензурная брань]");
    }

    private static String changeByakaAll(String text, String oldStr, String newStr) {
        int strLength = text.length();
        int oldStrLength = oldStr.length();
        StringBuilder builder = new StringBuilder(text.toLowerCase());
        StringBuilder builder2 = new StringBuilder(text);

        for (int i = 0; i < strLength; i++) {
            int index = builder.indexOf(oldStr.toLowerCase(), i);

            if (index == -1) {
                if (i == 0) {
                    return text;
                }
                return builder2.toString();
            }
            builder.replace(index, index + oldStrLength, newStr);
            builder2.replace(index, index + oldStrLength, newStr);

        }
        return builder2.toString();
    }



//    задание 4 - Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
    private static int countStrToStr(String where, String example) {
        int count = 0;
        for (String s : where.split(" ")) {
            if (s.equalsIgnoreCase(example)) {
                count += 1;
            }
        }
        return count;
    }

// задание 5 - Напишите метод, который инвертирует слова в строке.
// Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
    private static String reverseWordsInStr(String line) {
        String[] strArr = line.split(" ");
        String[] invArr = new  String[strArr.length];
        String newStr = "";
        StringBuilder sum = new StringBuilder();
        for (int i = 0; i < strArr.length ; i++) {
            StringBuilder a = new StringBuilder(strArr[i]);
            invArr[i] = a.reverse().toString();
            newStr += invArr[i] + " ";
        }
        return newStr;
    }


    private static String reverseWordsInStrBuilder(String line) {
    StringBuilder str = new StringBuilder();
        for (Object word : line.split(" ")) {
            StringBuilder reWord = new StringBuilder(word.toString()).reverse();
            str.append(reWord).append(" ");
        }
        return str.toString();
    }

}