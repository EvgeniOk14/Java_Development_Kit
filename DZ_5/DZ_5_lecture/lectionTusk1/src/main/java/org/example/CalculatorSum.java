package org.example;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CalculatorSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // вызов сканера
        Queue<TaskSum> queue = new ArrayDeque<>(); // очередь задач для выполнения
        ExecutorService executor = Executors.newFixedThreadPool(2); // пул потоков для выполнения задач
        Thread taskService; // Поток для обработки задач из очереди

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
                        TaskSum taskSum = queue.poll(); // Извлечение задачи из очереди
                        if (taskSum != null)
                        {
                            System.out.println("TaskSum " + taskSum + " started"); // Вывод сообщения о запуске задачи
                            taskSum.run(); // Выполнение задачи
                        }
                    });
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e); // Обработка исключения при прерывании потока
                }
            }
        });

        taskService.start();  // Запуск потока taskService

        while (in.hasNextLine()) // Цикл для ввода чисел с консоли
        {
            try
            {
                    String input1 = getInput(in, "Введите первое число: "); // ввод первого числа
                    int value1 = Integer.parseInt(input1); // Парсинг первой введенной строки в целочисленное значение

                    String input2 = getInput(in, "Введите второе число: "); // ввод второго числа
                    int value2 = Integer.parseInt(input2);// Парсинг второй введенной строки в целочисленное значение

                    TaskSum taskSum = new TaskSum(value1, value2);  // Создание новой задачи на основе введенного числа
                    queue.add(taskSum); // Добавление задачи в очередь
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