package com.sysoiev_bogdan.javacore.chapter28.concurrency.callable_future;

import java.util.Random;
import java.util.concurrent.*;

public class CallableClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Starting");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finishing");
                Random random = new Random();
                int randomValue = random.nextInt();
                if (randomValue < 5) throw new Exception("Something bad happened");

                return random.nextInt(10);
            }
        });
        executorService.shutdown();
        try {
            int result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable throwable = e.getCause();
            System.out.println(throwable.getMessage());
        }

    }

}
