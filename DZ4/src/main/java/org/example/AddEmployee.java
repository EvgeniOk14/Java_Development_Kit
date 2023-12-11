package org.example;

import java.util.List;

public interface AddEmployee<T>
{
    public void addEmployeeToList(List<T> list, T employee);
}
