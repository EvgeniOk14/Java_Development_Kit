package org.example;

import static org.example.ArrayComparator.compareArrays;

public class Main {
    public static void main(String[] args)
    {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        System.out.println(compareArrays(intArray1, intArray2)); // Вывод: true

        String[] strArray1 = {"a", "b", "c"};
        String[] strArray2 = {"a", "b", "c"};
        System.out.println(compareArrays(strArray1, strArray2)); // Вывод: true

        Double[] doubleArray = {1.1, 2.2, 3.3};
        // Некорректное сравнение разных типов, должно вернуть false
        System.out.println(compareArrays(intArray1, doubleArray)); // Выво false
    }
}