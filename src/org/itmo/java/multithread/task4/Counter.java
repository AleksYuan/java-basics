package org.itmo.java.multithread.task4;

public class Counter {
    public int co = 0;

    public int getCo() {
        return co;
    }

    public synchronized void zero(String className) {
            if (co < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.err.println("Error: " + e);
                }
            }
        System.out.println(className);
            co--;
            notify();
        }

    public synchronized void one(String className) {
        if (co >= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Error: " + e);
            }
        }
        System.out.println(className);
        co++;
        notify();
    }
}
