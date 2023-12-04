package OperationsWithNumbers.abstractClasses;

import ClassCalculator.Calculator;
import OperationsWithNumbers.interfaces.implementsClasses.InterfaceMultiplicationOperation;
import java.util.List;

public class AbstractMultiplicationOperation implements InterfaceMultiplicationOperation {
    @Override
    public void interfaceMultiplication(Number x, Number y, List list)
    {
        double result = x.doubleValue() * y.doubleValue();
        System.out.println("Результат умножения: " + x.doubleValue() + " * " + y.doubleValue() + " = " + result);
        System.out.println("");
        Calculator calculator = new Calculator(list);
        calculator.saveOperation("умножение ", result);
    }
}
