package org.itmo.java.multithread.task4;

public class Thread2 extends Thread{
    Counter counter;

    Thread2(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.zero(this.getName());
//            System.out.println(this.getName());
//            System.out.println(counter.co);

        }
    }
}
