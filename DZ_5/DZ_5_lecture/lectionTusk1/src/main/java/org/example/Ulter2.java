package org.example;

import java.util.Scanner;
import java.util.concurrent.*;

public class Ulter2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(2);

        while (in.hasNextLine())
        {
            try
            {
                String input = getInput(in, "Введите задачу (sum / multy): ");
                String operation = input.equalsIgnoreCase("multy") ? "mult" : "sum";

                String input1 = getInput(in, "Введите первое число: ");
                int value1 = Integer.parseInt(input1);

                String input2 = getInput(in, "Введите второе число: ");
                int value2 = Integer.parseInt(input2);

                CompletableFuture<Void> future = null;

                if (operation.equals("sum"))
                {
                    future = CompletableFuture.runAsync(() ->
                    {
                        TaskSum taskSum = new TaskSum(value1, value2);
                        System.out.println("TaskSum " + taskSum + " started");
                        taskSum.run();
                    }, executor);
                }
                else if (operation.equals("mult"))
                {
                    String inputSymbol = getInput(in, "Введите математический знак ('+'; '-'; '*'; '/'): ");
                    String operator = inputSymbol.trim();

                    future = CompletableFuture.runAsync(() ->
                    {
                        TaskMulty taskMulty = new TaskMulty(value1, value2, operator);
                        System.out.println("TaskMulty " + taskMulty + " started");
                        taskMulty.run();
                    }, executor);
                }

                if (future != null)
                {
                    future.get(); // ожидаем завершения задачи (можно добавить таймаут или обработку исключений)
                }

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }

    private static String getInput(Scanner in, String message)
    {
        while (true)
        {
            System.out.print(message);
            String input = in.nextLine().trim();
            if (!input.isEmpty())
            {
                return input;
            }
            System.out.println("Ввод не может быть пустым. Пожалуйста, введите значение.");
        }
    }
}
