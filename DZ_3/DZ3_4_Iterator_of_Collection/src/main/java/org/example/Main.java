package org.example;

public class Main {
    public static void main(String[] args)
    {
        /** Создаем коллекцию и добавляем элементы **/
        CustomCollection<String> collection = new CustomCollection<>();
        collection.add("Element 1");
        collection.add("Element 2");
        collection.add("Element 3");

        /** Используем внутренний итератор для перебора элементов **/
        for (String element : collection)
        {
            System.out.println(element);
        }
    }
}