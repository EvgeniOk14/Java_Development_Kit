package OperationsWithNumbers.abstractClasses;

import ClassCalculator.Calculator;
import Exceptions.RaisingToDegreeException;
import OperationsWithNumbers.interfaces.implementsClasses.InterfaceRaisingToPowerOperation;

import java.util.List;

public class AbsrtactRaisingToPowerOperation implements InterfaceRaisingToPowerOperation
{
    @Override
    public void interfaceRasingToPawer(Number x, Number y, List list) throws RaisingToDegreeException
    {
        if (y.doubleValue() < 0)
        {
            throw new RaisingToDegreeException("Степень должна быть положительной! ");
        }
        else
        {
            double result = Math.pow(x.doubleValue(), y.doubleValue());
            System.out.println("Результат возведения в степень: " + x.doubleValue() + " ^ " + y.doubleValue() + " = " + result);
            System.out.println("");
            Calculator calculator = new Calculator(list);
            calculator.saveOperation("возведение в степень ", result);
        }
    }
}
