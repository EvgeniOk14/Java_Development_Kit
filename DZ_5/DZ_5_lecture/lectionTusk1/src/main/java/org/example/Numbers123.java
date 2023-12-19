package org.example;

public class Numbers123 implements Runnable
{
        private static int currentThread = 1;
        public final int text;
        private final Object monitor;

        public Numbers123(int text)
        {
            this.text = text;
            this.monitor = Numbers123.class;
        }

    @Override
    public void run() {
        while (true) {
            synchronized (monitor) {
                // Печать только если текущий поток совпадает с номером этого потока
                if (text == currentThread) {
                    System.out.print(text);
                    currentThread = currentThread % 3 + 1;// Переключение на следующий поток
                    try {
                        Thread.sleep(300);
                        monitor.notifyAll(); // Используйте notifyAll() для уведомления всех потоков
                        monitor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        monitor.notifyAll();
                        monitor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        }



//        @Override
//        public void run()
//        {
//            while (true)
//            {
//                synchronized (monitor)
//                {
//                    System.out.print(text);
//                    try
//                    {
//                        Thread.sleep(300);
//                        monitor.notify();
//                        monitor.wait();
//                    }
//                    catch (InterruptedException e)
//                    {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }

        public static void main(String[] args)
        {
            Thread one = new Thread(new Numbers123(1));
            Thread two = new Thread(new Numbers123(2));
            Thread three = new Thread(new Numbers123(3));
            one.start();
            two.start();
            three.start();
        }
}

