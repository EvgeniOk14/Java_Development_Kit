package OperationsWithNumbers.interfaces.implementsClasses;

import Exceptions.RaisingToDegreeException;

import java.util.List;

public interface InterfaceSubstractionOperation <T extends Number>
{
    <T extends Number> void interfaceSubstraction(T x, T y, List list) throws RaisingToDegreeException;
}
