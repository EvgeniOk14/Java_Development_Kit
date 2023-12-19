package org.example;

public class Switcher
{
    public boolean switcher = false;
    public int count =100;

    Thread threadA = new Thread(() ->
    {
        while (count > 0)
        {
            try
            {
                switcher = !switcher;
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Поток threadA прерван!");
            }
        }
    });

    Thread threadB = new Thread(()->
    {
        while (count > 0)
        {
            while (!switcher)
            {
                try
                {
                    Thread.sleep(1);
                }
                catch (InterruptedException e)
                {
                    System.out.println("Поток threadB прерван!");
                }
            }
            System.out.print(count-- + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    });



    public static void main(String[] args)
    {
        Switcher switcher = new Switcher();
        switcher.threadA.start();
        switcher.threadB.start();
    }
}
