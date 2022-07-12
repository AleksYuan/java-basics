package org.itmo.java.lesson10.service;

import org.itmo.java.lesson10.Service;
import org.itmo.java.lesson10.HW10.Text;

import java.io.*;

public class ServiseText implements Service {

    @Override
    public Text create(String path) {
        Text text = new Text(path);
        return text;
    }

    @Override
    public void replace(Text text, Text text2, String changes) {

        String path = text.getPath();
        String path2 = text2.getPath();

        File file = new File(path);
        File out = new File(path2);
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

    @Override
    public void readText(Text text) {
        String path = text.getPath();
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

    @Override
    public void addText(Text text1, Text text2, Boolean addReplace) {
        InputStream is = null;
        OutputStream os = null;

        String path = text1.getPath();
        String path2 = text2.getPath();

        try {
            is = new FileInputStream(path);
            os = new FileOutputStream(path2, addReplace);
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
}
