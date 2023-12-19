package org.example;

import java.util.List;

public interface SearchBy<T>
{
    public void searchEmployeeBySeniority(List<T> list, int seniority);
    public void searchEmployeeByName(List<T> list, String name);

}
