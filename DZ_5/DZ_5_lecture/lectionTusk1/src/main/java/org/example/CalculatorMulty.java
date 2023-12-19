package org.example;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CalculatorMulty
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // вызов сканера
        Queue<TaskMulty> queue = new ArrayDeque<>(); // очередь задач для выполнения
        ExecutorService executor = Executors.newFixedThreadPool(2); // пул потоков для выполнения задач
        Thread taskService; // Поток для обработки задач из очереди
        Queue<TaskSum> queueSum = new ArrayDeque<>(); // очередь задач для выполнения
        Thread taskService2;

        /** Инициализация потока taskService в конструкторе **/
        taskService = new Thread(() ->
        {
            while (true) // Бесконечный цикл для обработки задач
            {
                try {
                    Thread.sleep(500); // Приостановка потока на 1000 миллисекунд (1 секунду)
                    // Подача задачи в пул потоков
                    executor.submit(() ->
                    {
                        TaskMulty taskMulty = queue.poll(); // Извлечение задачи из очереди
                        if (taskMulty != null)
                        {
                            System.out.println("TaskMulty " + taskMulty + " started"); // Вывод сообщения о запуске задачи
                            taskMulty.run(); // Выполнение задачи
                        }
                    });
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e); // Обработка исключения при прерывании потока
                }
            }
        });

        taskService.start();  // Запуск потока taskService

        /** Инициализация потока taskService2 в конструкторе **/
        taskService2 = new Thread(() ->
        {
            while (true) // Бесконечный цикл для обработки задач
            {
                try {
                    Thread.sleep(500); // Приостановка потока на 1000 миллисекунд (1 секунду)
                    // Подача задачи в пул потоков
                    executor.submit(() ->
                    {
                        TaskSum taskSum = queueSum.poll(); // Извлечение задачи из очереди
                        if (taskSum != null)
                        {
                            System.out.println("taskService2 TaskSum " + taskSum + " started"); // Вывод сообщения о запуске задачи
                            taskSum.run(); // Выполнение задачи
                        }
                    });
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e); // Обработка исключения при прерывании потока
                }
            }
        });

        taskService2.start();  // Запуск потока taskService


        while (in.hasNextLine()) // Цикл для ввода чисел с консоли
        {
            try {
                String input3 = getInput(in, "Ведите задачу (sum / multy): ");
                String value3 = input3;

                if (input3.equalsIgnoreCase("multy"))
                {
                    String input1 = getInput(in, "Введите первое число: "); // ввод первого числа
                    int value1 = Integer.parseInt(input1); // Парсинг первой введенной строки в целочисленное значение

                    String input2 = getInput(in, "Введите второе число: "); // ввод второго числа
                    int value2 = Integer.parseInt(input2);// Парсинг второй введенной строки в целочисленное значение

                    String inputSymbol = getInput(in, "Введите математичестки знак ('+'; '-'; '*'; '/')");
                    String operation = inputSymbol;

                    TaskMulty taskMulty = new TaskMulty(value1, value2, operation);  // Создание новой задачи на основе введенного числа
                    queue.add(taskMulty); // Добавление задачи в очередь
                }
                else if (input3.equalsIgnoreCase("sum"))
                {
                    String input1 = getInput(in, "Введите первое число: "); // ввод первого числа
                    int value1 = Integer.parseInt(input1); // Парсинг первой введенной строки в целочисленное значение

                    String input2 = getInput(in, "Введите второе число: "); // ввод второго числа
                    int value2 = Integer.parseInt(input2);// Парсинг второй введенной строки в целочисленное значение


                    TaskSum taskSum = new TaskSum(value1, value2);
                    queueSum.add(taskSum);
                }

            }
            catch(Exception e)
            {
                e.printStackTrace(); // Обработка исключения при возникновении ошибок ввода
            }
        }
        taskService.interrupt(); // Завершение работы потока taskService и пула потоков
        executor.shutdown(); // выключение потоков
    }



    /** унверсальный способ на проверку пустого ввода! **/
    private static String getInput (Scanner in, String message)
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

