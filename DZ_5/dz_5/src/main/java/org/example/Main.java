package org.example;

/*      Есть пять философов (потоки), которые могут либо обедать либо размышлять.
        Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
        После каждого приема пищи философ должен размышлять
        Не должно возникнуть общей блокировки
        Философы не должны есть больше одного раза подряд*/

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {

        Philosopher philosopher = new Philosopher();
        Thread thread1 = new Thread(philosopher);
        Thread thread2 = new Thread(philosopher);
        Thread thread3 = new Thread(philosopher);
        Thread thread4 = new Thread(philosopher);
        Thread thread5 = new Thread(philosopher);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        System.out.println("все философы пообедали и подумали");
    }
}