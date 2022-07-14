package org.itmo.java.multithread.task1;

public class MultiThread {
    static PrintCount secondThread;

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            secondThread = new PrintCount();
            System.out.println(secondThread.getState());
            secondThread.start();
            System.out.println(secondThread.getState());
        }

        System.out.println(Thread.activeCount() + "  count of thread");
        System.out.println("thread " + " Basic " + "done");
    }
}
