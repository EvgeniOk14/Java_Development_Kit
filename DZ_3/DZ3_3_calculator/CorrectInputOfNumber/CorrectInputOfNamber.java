package CorrectInputOfNumber;

import CallingScanner.CallingScanner;
import TabloOperation.TabloOperation;


import java.util.Scanner;

public class CorrectInputOfNamber
{
    public int correctInputOfNumber()
    {
        TabloOperation tabloOperation = new TabloOperation();
        tabloOperation.tabloOperation();

        System.out.println("Введите номер операции: ");

        CallingScanner callingScanner = new CallingScanner();
        int operationNumber = callingScanner.collingScannerOperations();

        while (operationNumber < 0 && operationNumber > 6 )
        {

            System.out.println("Вы введи не корректный номер операции: ");
            tabloOperation.tabloOperation();
            System.out.println("Ведите корректно номер операции снова: ");
            CallingScanner callingScanner1 = new CallingScanner();
            int numberChoise1 = callingScanner1.collingScannerOperations();

            return numberChoise1;
        }
//        System.out.println("Вы выбрали операцию номер: " + operationNumber );
       return operationNumber;
    }
}
