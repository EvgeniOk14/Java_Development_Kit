package org.example;

import java.util.ArrayList;

import static org.example.ArrayComparator.compareArrays;
import static org.example.ListComporator.compareLists;

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


        System.out.println("Сравнение двух списков: list1 и list2");
        ArrayList list1 = new ArrayList();
        String  component1 = "aaa";
        String  component2 = "bbb";
        String  component3 = "ccc";
        list1.add(component1);
        list1.add(component2);
        list1.add(component3);

        ArrayList list2 = new ArrayList();
        String  component4 = "aaa";
        String  component5 = "bbb";
        String  component6 = "ccc";
        list2.add(component4);
        list2.add(component5);
        list2.add(component6);

        System.out.println(compareLists(list1, list2)); // возвращает true

        System.out.println("Сравнение двух списков: list3 и list4");
        ArrayList list3 = new ArrayList();
        String  component7= "aaa";
        String  component8= "bbb";
        String  component9= "ccc";
        list3.add(component7);
        list3.add(component8);
        list3.add(component9);

        ArrayList list4 = new ArrayList();
        String  component10 = "aab";
        String  component11 = "bbb";
        String  component12  ="ccc";
        list4.add(component10);
        list4.add(component11);
        list4.add(component12);

        System.out.println(compareLists(list3, list4)); // возвращает false
    }
}