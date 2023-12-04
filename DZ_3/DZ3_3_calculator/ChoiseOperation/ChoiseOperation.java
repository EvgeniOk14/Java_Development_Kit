package ChoiseOperation;

import ChangeValuesOfNumbersXY.ChangeValues;
import ClassCalculator.Calculator;
import CorrectInputOfNumber.CorrectInputOfNamber;
import Exceptions.DivisionByNullException;
import Exceptions.RaisingToDegreeException;
import OperationsWithNumbers.*;
import OperationsWithNumbers.interfaces.implementsClasses.InterfaceRaisingToPowerOperation;
import OperationsWithNumbers.interfaces.implementsClasses.InterfaceSubstractionOperation;
import OperationsWithNumbers.interfaces.implementsClasses.InterfaceSummOperation;
import OperationsWithNumbers.interfaces.implementsClasses.InterfacewDevisionOperation;
import java.util.List;


public class ChoiseOperation
{
    private static boolean work = true;
    private double x;
    private double y;
    private List list;

    public ChoiseOperation(double x, double y, List list)
    {
        this.x = x;
        this.y = y;
        this.list = list;
    }

    public void exit()
    {
        System.out.println("Работа завершена, Вы вышли из программы! ");
        work = false;
    }

    public void choiseOperation(double x, double y, List list)
    {
        while (work)
        {
            CorrectInputOfNamber correctInputOfNamber = new CorrectInputOfNamber();
            int operationNumber = correctInputOfNamber.correctInputOfNumber();
            {
                switch (operationNumber)
                {
                    case 1:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (+) сложение: \n");
                        InterfaceSummOperation summOperation =  new SummOperation();
                        summOperation.interfaceSumm(x, y, list);
                        break;
                    case 2:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (-) вычитание: \n");
                        InterfaceSubstractionOperation substractionOperation = new SubtractionOperation();
                        try
                        {
                            substractionOperation.interfaceSubstraction(x, y, list);
                        }
                        catch (RaisingToDegreeException e)
                        {
                            System.out.println("ошибка: " + e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (*) умножение: \n");
                        MultiplicationOperation multiplicationOperation = new MultiplicationOperation();
                        multiplicationOperation.interfaceMultiplication(x, y, list);
                        break;
                    case 4:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (/) деление: \n");
                        InterfacewDevisionOperation devisionOperation = new DevisionOperation();

                        try
                        {
                              devisionOperation.interfaceDevisionOperation(x, y, list);
                        }
                        catch (DivisionByNullException e)
                        {
                            System.out.println("ошибка: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (^) возвединее в степень: \n");
                        InterfaceRaisingToPowerOperation raisingToPower = new RaisingToPower();
                        try
                        {
                            raisingToPower.interfaceRasingToPawer(x, y, list);
                        }
                        catch (RaisingToDegreeException e)
                        {
                            System.out.println("ошибка: " + e.getMessage());
                        }
                        break;
                    case 6:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (замена значений X и Y): \n");
                        ChangeValues changeValues = new ChangeValues(list);
                        changeValues.changeValues(list);
                        break;
                    case 7:
                        Calculator calculator = new Calculator(list);
                        calculator.printList(list);
                        break;
                    case 8:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (Вывод операций калькулятора): \n");
                        System.out.println("Вы выбрали операцию " + operationNumber + " (Выход): \n");
                        exit();
                        break;
                    default:
                        System.out.println("Ошибка ввода! Вы ввели неправильные данные! ");
                        break;
                }
            }
        }
    }
}
