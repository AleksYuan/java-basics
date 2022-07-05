package org.itmo.java.lesson7;

public class LocalClassExample {
    static String regex = "[^0-9]";

    public static void validatedPhoneNumber(String num1, String num2) {
        final int numberLenght = 10;

        class PhoneNumber {
            String formattedNumber = null;

            public PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regex, "");
                if (currentNumber.length() == numberLenght) {
                    formattedNumber = currentNumber;
                }
            }

            public String getFormattedNumber() {
                return formattedNumber;
            }
        }

        PhoneNumber phoneNumber1 = new PhoneNumber(num1);
        PhoneNumber phoneNumber2 = new PhoneNumber(num2);

        String formattedNumber1 = phoneNumber1.getFormattedNumber();
        String formattedNumber2 = phoneNumber2.getFormattedNumber();

        if (formattedNumber1 == null) {
            System.out.println("First number nob valid");
        } else {
            System.out.println("First number is valid");
        }

        if (formattedNumber2 == null) {
            System.out.println("Second number nob valid");
        } else {
            System.out.println("Second number is valid");
        }
    }

        public static void main(String[] args ) {
        validatedPhoneNumber("921-131-14-21", "323-5");

        }

    }
