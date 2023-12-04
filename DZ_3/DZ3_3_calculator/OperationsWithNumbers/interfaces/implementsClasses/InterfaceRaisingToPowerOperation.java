package OperationsWithNumbers.interfaces.implementsClasses;

import Exceptions.RaisingToDegreeException;

import java.util.List;
public interface InterfaceRaisingToPowerOperation <T extends Number>
{
    <T extends Number> void interfaceRasingToPawer(T x, T y, List list) throws RaisingToDegreeException;
}
