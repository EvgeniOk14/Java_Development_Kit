package org.example;

public class TicTak implements Runnable {
    public final String bracket;
    private final Object monitor;

    public TicTak(String bracket) {
        this.bracket = bracket;
        this.monitor = TicTak.class;
    }

//    @Override
//    public void run()
//    {
//        while (true)
//        {
//                System.out.println(bracket);
//                try
//                {
//                    Thread.sleep(300);
//                }
//                catch (InterruptedException e)
//                {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

    @Override
    public void run() {
        while (true) {
            synchronized (monitor) {
                System.out.print(bracket);
                try {
                    Thread.sleep(300);
                    monitor.notify();
                    monitor.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


        public static void main(String[] args)
        {
            Thread tic = new Thread(new TicTak("["));
            Thread tak = new Thread(new TicTak("]"));
//        tic.setDaemon(true);
//        tak.setDaemon(true);
            tic.start();
            tak.start();
        }
    }


