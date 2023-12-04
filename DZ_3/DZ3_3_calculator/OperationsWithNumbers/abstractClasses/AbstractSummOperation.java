package OperationsWithNumbers.abstractClasses;

import ClassCalculator.Calculator;
import OperationsWithNumbers.interfaces.implementsClasses.InterfaceSummOperation;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSummOperation implements InterfaceSummOperation
{
    @Override
    public void interfaceSumm(Number x, Number y, List list)
    {
        double result = x.doubleValue() + y.doubleValue();
        System.out.println("Результат сложения: " + x.doubleValue() + " + " + y.doubleValue() + " = " + result);
        System.out.println("");
        Calculator calculator = new Calculator((ArrayList) list);
        calculator.saveOperation("сложение ", result);
    }
}
