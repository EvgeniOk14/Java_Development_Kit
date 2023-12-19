package org.example;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calculator
{
    public static void main(String[] args)
    {

    /** поле: Сканер **/
    Scanner in = new Scanner(System.in);
    /** поле: Очередь задач для выполнения **/
    Queue<Task> queue = new ArrayDeque<>();
    /** поле: Пул потоков для выполнения задач **/
    ExecutorService executor = Executors.newFixedThreadPool(2);
    // Поток для обработки задач из очереди
    Thread taskService;

    /** Конструктор класса Calculator **/

        // Инициализация потока taskService
        taskService = new Thread(() ->
        {
            // Бесконечный цикл для обработки задач
            while (true)
            {
                try
                {
                    // Приостановка потока на 2000 миллисекунд (2 секунды)
                    Thread.sleep(1000);
                    // Подача задачи в пул потоков
                    executor.submit(() ->
                    {
                        // Извлечение задачи из очереди
                        Task task = queue.poll();
                        if (task != null)
                        {
                            // Вывод сообщения о запуске задачи
                            System.out.println("Task " + task + " started");
                            // Выполнение задачи
                            task.run();
                        }
                    });
                }
                catch (InterruptedException e)
                {
                    // Обработка исключения при прерывании потока
                    throw new RuntimeException(e);
                }
            }
        });

        // Запуск потока taskService
        taskService.start();


        // Цикл для ввода чисел с консоли
        while (in.hasNextLine())
        {
            try
            {
            String input = in.nextLine().trim();

            // Проверка на пустую строку и выход из цикла
            if (input.isEmpty())
            {
                break;
            }


                // Парсинг введенной строки в целочисленное значение
                int value = Integer.parseInt(input);
                // Создание новой задачи на основе введенного числа
                Task task = new Task(value);
                // Добавление задачи в очередь
                queue.add(task);
            }
            catch (Exception e)
            {
                // Обработка исключения при возникновении ошибок ввода
                e.printStackTrace();
            }
        }
        // Завершение работы потока taskService и пула потоков
        taskService.interrupt();
        executor.shutdown();
    }
}