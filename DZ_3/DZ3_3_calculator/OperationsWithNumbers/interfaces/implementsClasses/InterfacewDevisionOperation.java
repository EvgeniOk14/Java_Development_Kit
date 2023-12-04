package OperationsWithNumbers.interfaces.implementsClasses;

import Exceptions.DivisionByNullException;

import java.util.List;

public interface InterfacewDevisionOperation<T extends Number>
{
    <T extends Number> void interfaceDevisionOperation(T x, T y, List list) throws DivisionByNullException;
}
