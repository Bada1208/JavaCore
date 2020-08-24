package com.sysoiev_bogdan.javacore.tasks.concurrency.task2executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.IntConsumer;

class ExecutorDemo {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(20);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        //first thread
        Runnable runnableFizz = () -> {
            Runnable fizz = () -> {
            };
            try {
                fizzBuzz.fizz(fizz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Future future1 = executorService.submit(runnableFizz);
        //second thread
        Runnable runnableBuzz = () -> {
            Runnable buzz = () -> {
            };
            try {
                fizzBuzz.buzz(buzz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Future future2 = executorService.submit(runnableBuzz);
        //third thread
        Runnable runnableFizzBuzz = () -> {
            Runnable fizzBuzzRun = () -> {
            };
            try {
                fizzBuzz.fizzbuzz(fizzBuzzRun);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Future future3 = executorService.submit(runnableFizzBuzz);
        //forth thread
        Runnable runnablePrint = () -> {
            System.out.println();
            IntConsumer consumer = null;
            for (int i = 1; i <= fizzBuzz.getN(); i++) {
                consumer = a -> System.out.print(a + " ");
                consumer.accept(i);
            }
            try {
                fizzBuzz.number(consumer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Future future4 = executorService.submit(runnablePrint);

        try {
            future1.get();
            future2.get();
            future3.get();
            future4.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}

