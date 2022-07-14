package org.itmo.java.multithread.task1;

public class PrintCount extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i);
        }
        System.out.println("thread " + this.getName() + "  done");
    }
}
