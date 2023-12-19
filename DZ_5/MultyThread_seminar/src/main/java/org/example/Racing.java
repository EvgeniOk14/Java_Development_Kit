package org.example;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/*        3 бегуна должны прийти к старту гонки
        ● Программа должна гарантировать, что гонка начнется только когда все три
           участника будут на старте
        ● Программа должна отсчитать “На старт”, “Внимание”, “Марш”
        ● Программа должна завершиться когда все участники закончат гонку.
        ● Подумайте об использовании примитива синхронизации */
public class Racing implements Runnable
{
    CountDownLatch readyToStart;
    CountDownLatch raceStart;
    public Racing(CountDownLatch readyToStart, CountDownLatch raceStart)
    {
        this.raceStart = raceStart;
        this.readyToStart = readyToStart;
    }


    @Override
    public void run() {
        System.out.println("Иду на старт: " + Thread.currentThread().getName());
        try
        {
            Thread.sleep(new Random().nextInt(200, 500));
            readyToStart.countDown();
            raceStart.await();
            System.out.println("Бегу.....");
            Thread.sleep(new Random().nextInt(3000, 5000));
            System.out.println("Прибежал " + Thread.currentThread().getName());
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch allStart  = new CountDownLatch(3);
        CountDownLatch startRacing = new CountDownLatch(1);
        Racing racing = new Racing(allStart, startRacing);
        Thread thread1 = new Thread(racing);
        Thread thread2 = new Thread(racing);
        Thread thread3 = new Thread(racing);
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Ждём всех бегунов ...");
        allStart.await();
        System.out.println("Все пришли...");
        System.out.println("На старт! внимание! марш!");
        startRacing.countDown();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Гонка завершена!");

    }
}
