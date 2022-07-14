package org.itmo.java.multithread.task3;

public class ThreadCount implements Runnable{
    final Counter co;

    public ThreadCount(Counter counter) {
        this.co = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            co.increment();
//            System.out.println(co.count);
        }
    }
}
