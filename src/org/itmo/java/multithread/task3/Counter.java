package org.itmo.java.multithread.task3;

public class Counter {
     int count = 0;

    public void increment() {
        synchronized (this) {
            count = count + 1;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
