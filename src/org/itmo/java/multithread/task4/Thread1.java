package org.itmo.java.multithread.task4;

public class Thread1 extends Thread {
    Counter counter;

    Thread1(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.one(this.getName());
//            System.out.println(this.getName());
//            System.out.println(counter.co);

        }
    }
}
