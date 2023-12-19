package org.example;

public class MyRunnable implements Runnable
{
    @Override
    public void run() {
        System.out.println("Привет из потока MyRunnable номер: " + Thread.currentThread().threadId() + " имя потока: " + Thread.currentThread().getName()
                + " группа потока: " + Thread.currentThread().getThreadGroup() + " текущий поток: " + Thread.currentThread());
    }
}