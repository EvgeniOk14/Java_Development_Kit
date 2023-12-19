package org.example;

class Philosopher implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            for (int i = 0; i < 3; i++)
            {
                // Философ размышляет
                System.out.println("Философ " + Thread.currentThread().getId() + " размышляет");
                Thread.sleep(500);

                // Философ обедает
                System.out.println("Философ " + Thread.currentThread().getId() + " обедает");
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
