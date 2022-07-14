package org.itmo.java.multithread.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        System.out.println(counter.count);
        Thread threadCount = null;


        long a1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            threadCount = new Thread(new ThreadCount(counter), "my 2 thread");
            threadCount.start();
            threadCount.join(5); // при создании этого программа выаолняется последовательно. Как обойти ?
        }

//        Thread.sleep(150);

        try {
            threadCount.join();
        } catch (InterruptedException e) {
            System.out.printf("%s has been interrupted", threadCount.getName());
        }

        System.out.println(counter.count);
        System.out.println(System.currentTimeMillis() - a1);



// потестил что быстрее, в чем прикол потоков ?
        Counter counter2 = new Counter();
        System.out.println("2cycle " + counter2.count);

        long a2 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            counter2.increment();
        }
        System.out.println("2cycle " + counter2.count);
        System.out.println(System.currentTimeMillis() - a2);
    }
}
