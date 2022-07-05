package org.itmo.java.lesson8;

import javax.imageio.IIOException;
import java.io.*;
import java.util.logging.Logger;

/*
 * Обработка исключений
 *
 *
 */
public class Main {
    static Logger logger = Logger.getLogger("Logger");
//    SLF4j - библиотека логирование

    public static void main(String[] args) {
        try {
            methodWithExeption();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (IIOException e) {
//            throw new RuntimeException(e);
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("finnaly");  // блок выполняется всегда
        }

//        unchekedExceptionMethod();
    }

    public static void  methodWithExeption() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i =Integer.parseInt(reader.readLine());
        System.out.println(i);
    }

    public static void unchekedExceptionMethod() throws MyUnchekedExeption {
        throw new MyUnchekedExeption("MyUnchekedExeption");
    }
}
