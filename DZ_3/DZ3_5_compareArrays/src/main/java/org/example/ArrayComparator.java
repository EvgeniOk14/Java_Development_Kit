package org.example;

import java.util.Arrays;

public class ArrayComparator
{
    public static <T> boolean compareArrays(T[] array1, T[] array2)
    {
        // Проверка на null
        if (array1 == null || array2 == null)
        {
            return false;
        }
        // Проверка на длину массивов
        if (array1.length != array2.length)
        {
            return false;
        }
        // Проверка на тип элементов
        if (!array1.getClass().getComponentType().equals(array2.getClass().getComponentType()))
        {
            return false;
        }
        // Сравнение элементов
        return Arrays.equals(array1, array2);
    }
}
