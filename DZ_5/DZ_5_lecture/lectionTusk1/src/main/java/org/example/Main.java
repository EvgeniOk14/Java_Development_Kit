package org.example;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 3; i++)
        {
            new MyThread().start();
        }

        for (int i = 0; i < 5; i++)
        {

           new Thread(new MyRunnable()).start();
        }

        for (int i = 0; i < 3; i++)
        {
            new Thread(() ->
            {
                System.out.println("Привет из потока ЛЯМБДА номер: " + Thread.currentThread().threadId() + " имя потока: " + Thread.currentThread().getName()
                        + " группа потока: " + Thread.currentThread().getThreadGroup() + " текущий поток: " + Thread.currentThread());
            }).start();
        }
    }
}