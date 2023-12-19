package org.example;

public class MyThread extends  Thread
{
    @Override
    public void run() {
        System.out.println("Привет из потока MyThread номер: " + Thread.currentThread().threadId() + " имя потока: " + Thread.currentThread().getName()
               + " группа потока: " + Thread.currentThread().getThreadGroup() + " текущий поток: " + Thread.currentThread());
    }
}
