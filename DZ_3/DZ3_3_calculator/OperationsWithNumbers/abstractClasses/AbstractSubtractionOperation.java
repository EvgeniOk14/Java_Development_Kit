package OperationsWithNumbers.abstractClasses;

import ClassCalculator.Calculator;
import Exceptions.RaisingToDegreeException;
import OperationsWithNumbers.interfaces.implementsClasses.InterfaceSubstractionOperation;
import java.util.List;

public class AbstractSubtractionOperation implements InterfaceSubstractionOperation
{
    @Override
    public void interfaceSubstraction(Number x, Number y, List list) throws RaisingToDegreeException
    {
        double result = x.doubleValue() -y.doubleValue();
        System.out.println("Результат вычитания: " + x.doubleValue() + " - "  + y.doubleValue() + " = " + result);
        System.out.println("");
        Calculator calculator = new Calculator(list);
        calculator.saveOperation("вычитание ", result);
    }
}
