package com.sysoiev_bogdan.javacore.chapter11.concurrency.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolClass {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));//передали задания
        }
        executorService.shutdown();//Инициирует аккуратное завершение работы, на котором выполняются ранее представленные задачи,
        // но никакие новые задачи не будут приняты.
        System.out.println("All tasks submitted");

        executorService.awaitTermination(1, TimeUnit.DAYS);//типо join()
    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was completed");
    }
}