package itmo.lab11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
         for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new FirstTask());
            thread.start();
        }
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int j = 0; j < 100; j++) {
            executorService.execute(() -> {
                for (int k = 0; k < 1000; k++) {
                    synchronized (counter) {
                        counter.increment();
                    }
                }
            });
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("Count = " + counter.getCount());

        ThreadName tread1 = new ThreadName("Tread1");
        ThreadName tread2 = new ThreadName("Tread2");

        tread1.start();
        tread2.start();


    }
}

