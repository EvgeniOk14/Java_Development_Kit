package OperationsWithNumbers;

import Exceptions.DivisionByNullException;
import OperationsWithNumbers.abstractClasses.AbstractDevisionOperation;

import java.util.List;

public class DevisionOperation extends AbstractDevisionOperation
{
    @Override
    public void interfaceDevisionOperation(Number x, Number y, List list) throws DivisionByNullException
    {
        super.interfaceDevisionOperation(x, y, list);
    }

}

