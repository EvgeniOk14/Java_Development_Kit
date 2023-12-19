package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPhoneDirectory<T extends AbstracktEmployee<T>> implements AddEmployee<T>, SearchBy<T>
{
    private List<Employee> list = new ArrayList<>();

    public AbstractPhoneDirectory(List<Employee> list)
    {
        this.list = list;
    }

    public void printEmployee(List<Employee> list)
    {
        list.stream().forEach(employee -> System.out.println(employee.toString()));
    }

    @Override
    public void addEmployeeToList(List<T> list, T employee)
    {
        boolean employeeExists = list.stream().anyMatch(existingEmployee -> existingEmployee.equals(employee));

        if (!employeeExists)
        {
            list.add(employee);
            System.out.println("Сотрудник успешно добавлен в список!");
        }
        else
        {
            System.out.println("Такой сотрудник уже есть в списке!");
        }
    }

    @Override
    public void searchEmployeeBySeniority(List<T> list, int seniority) {
        list.stream().filter(employee -> employee.getSeniority() == seniority).forEach(employee -> System.out.println("employee found" + employee));
    }

    @Override
    public void searchEmployeeByName(List<T> list, String name) {
        list.stream().filter(employee -> employee.getName().equals(name)).forEach(employee -> System.out.println("по заданному стажу: "
                + name + "\n" + "Найден сотрудник: " + "\n" + employee));

    }
}
