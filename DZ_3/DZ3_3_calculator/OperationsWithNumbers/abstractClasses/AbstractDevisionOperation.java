package OperationsWithNumbers.abstractClasses;

import ClassCalculator.Calculator;
import Exceptions.DivisionByNullException;
import OperationsWithNumbers.interfaces.implementsClasses.InterfacewDevisionOperation;
import java.util.List;

public abstract class AbstractDevisionOperation<T extends Number> implements InterfacewDevisionOperation
{
    @Override
    public void interfaceDevisionOperation(Number x, Number y, List list) throws DivisionByNullException
    {
        if(y == null || y.equals(0))
        {
            throw new DivisionByNullException("Делить на ноль нельзя! ");
        }
        else
        {
            double result = x.doubleValue() / y.doubleValue();
            System.out.println("Результат деления: " + x.doubleValue() + " / " + y.doubleValue() + " = " + result);
            System.out.println("");
            Calculator calculator = new Calculator(list);
            calculator.saveOperation("деление ", result);
        }

    }
}
