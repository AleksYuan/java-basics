package org.itmo.java.lesson10.HW10;

import java.io.*;

/* библиотека apache poi (помогает работать с таблицами строками и тп
 * пакет
 *
 *
 */


public class FunctionalTest {
    public static void main(String[] args) {

        printFile("files/text.txt");
        copyFail("files/text.txt", "files/new.txt", false);
        copyFail("files/text.txt", "files/output.txt", true);
//        replaceSmth("files/new.txt", "$");
        replaceData("files/text.txt", "files/new2.txt", "$");
    }

    //    метод считывает текстовый файл и печатает все в консоль
    public static void printFile(String path) {
        File file = new File(path);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input = null;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // метод считывает с одного файла и переписывает в другой (Задание 2 и 3)
    public static void copyFail(String from, String to, Boolean addOr) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(from);
            os = new FileOutputStream(to, addOr);
            String str = "";
            while (is.available() > 0) {
                os.write(is.read());
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (is != null) {
                    is.close();
                }

                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

//    //    Метод который заменяет в файле все кроме букв и цифр на что либо
//    public static void replaceSmth(String path, String changes) {
//        String data = "";
//        FileReader fr = null;
//        Scanner scan = null;
//        List<String> data2 = new ArrayList<>();
//
////        переписываем все в строку
//        try {
//            fr = new FileReader(path);
//            scan = new Scanner(fr);
//
//            while (scan.hasNextLine()) {
//                data += scan.nextLine();
//            }
//        } catch (IOException e) {
//            System.out.println("Error: " + e);
//        } finally {
//            try {
//                fr.close();
//                scan.close();
//            } catch (IOException e) {
//                System.err.println("Error: " + e);
//            }
//        }
//
////        Заменяем все лишнее на знак какой нибудь
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < data.length(); i++) {
////            System.out.println(data.charAt(0));
//            if (Character.isLetterOrDigit(data.charAt(i)) || Character.isWhitespace(data.charAt(i))) {
//                sb.append(data.charAt(i));
//            } else {
//                sb.append(changes);
//            }
//        }
//
////        Записываем в файл
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter(path);
//            fw.write(sb.toString());
//        } catch (IOException e) {
//            System.err.println("Error: " + e);
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                System.err.println("Error: " + e);
//            }
//        }
//    }

// Задание 4 во всей своей красе
    public static void replaceData(String path, String path2, String changes) {
        File file = new File(path);
        StringBuilder res = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input = null;
            while ((input = reader.readLine()) != null) {

                for (int i = 0; i < input.length(); i++) {
                    if (Character.isLetterOrDigit(input.charAt(i)) || Character.isWhitespace(input.charAt(i))) {
                        res.append(input.charAt(i));
                    } else {
                        res.append(changes);
                    }
                }
                res.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
//        System.out.println(res);

        FileWriter fw = null;
        try {
            fw = new FileWriter(path2);
            fw.write(res.toString());
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } finally {

            try {
                fw.close();
            } catch (IOException e) {
                System.err.println("Error: " + e);
            }
        }
    }
}
