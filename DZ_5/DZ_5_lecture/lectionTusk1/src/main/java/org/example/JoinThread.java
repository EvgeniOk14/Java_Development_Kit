package org.example;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 3; i++)
        {
            Thread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            thread.join();
        }

        for (int i = 0; i < 5; i++)
        {
            Thread thread = new Thread(new MyRunnable());
            thread.setDaemon(true);
            thread.start();
            thread.join();
        }

    }
}
