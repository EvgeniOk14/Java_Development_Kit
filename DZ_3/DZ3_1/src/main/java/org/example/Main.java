package org.example;

public class Main {
    public static void main(String[] args)
    {
        GenericArray array = new RealAray(5);

        array.set(0, "Привет ");
        array.set(1, "Мир ");
        array.set(2, "Из ");
        array.set(3, "Класса ");
        array.set(4, "Обобщений ");

        System.out.println("\n" + "печать созданного массива: ");
        array.printArray(); // печать созданного массива

        System.out.println("\n");


        array.swapTwoElements(1, 3);
        System.out.println("печать массива после замены двух элементов местами: " +  array.get(3) + " и "  + array.get(1));
        array.printArray();
    }
}