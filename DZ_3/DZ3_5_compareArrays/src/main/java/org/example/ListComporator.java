package org.example;

import java.util.Arrays;
import java.util.List;

public class ListComporator<T extends List>
{
    public static <T extends List> boolean compareLists(T list1, T list2)
    {
        // Проверка на null
        if (list1 == null || list2 == null)
        {
            return false;
        }
        // Проверка на длину массивов
        if (list1.size() != list2.size())
        {
            return false;
        }
        // Проверка на тип элементов
        for (int i = 0; i < list1.size(); i++)
        {
            if (!list1.get(i).equals(list2.get(i)))
            {
                return false;
            }
        }
        // Сравнение элементов
        return true;
    }
}
