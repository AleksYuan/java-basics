package org.itmo.java.multithread.task4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread1 tM = new Thread1(counter);
        Thread2 tM2 = new Thread2(counter);

//        System.out.println(tM.getName());
//        System.out.println(tM2.getName());
        tM.start();
        tM2.start();
    }
}
