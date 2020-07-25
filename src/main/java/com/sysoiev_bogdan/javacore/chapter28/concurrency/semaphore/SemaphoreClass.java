package com.sysoiev_bogdan.javacore.chapter28.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreClass {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);//permits - разрешения
        try {
            semaphore.acquire();//начинаем взаимодействие с ресурсом
            semaphore.acquire();//начинаем взаимодействие с ресурсом
            semaphore.acquire();//начинаем взаимодействие с ресурсом
            System.out.println("All permits are been acquired");
            semaphore.acquire();
            System.out.println("Cann`t reach here...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();//отдает разрешение
        System.out.println(semaphore.availablePermits());//количество разрешений
    }
}
