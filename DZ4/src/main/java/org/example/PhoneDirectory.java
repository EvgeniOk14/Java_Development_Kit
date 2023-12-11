package org.example;

import java.util.List;

public class PhoneDirectory extends AbstractPhoneDirectory<Employee>
{
    public PhoneDirectory(List<Employee> list)
    {
        super(list);
    }


    public void printEmployee(List<Employee> list)
    {
        list.stream().forEach(employee -> System.out.println(employee.toString()));
    }

    /** метод добавления сотрудников в справочник **/
    @Override
    public void addEmployeeToList(List<Employee> list, Employee employee)
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

    /** метод поиска сотрудника по стажу **/
    @Override
    public void searchEmployeeBySeniority(List<Employee> list, int seniority) {
        list.stream().filter(employee -> employee.getSeniority() == seniority).forEach(employee -> System.out.println("по заданному стажу: "
                + seniority + "\n" + "Найден сотрудник: " + "\n" + employee));
    }

    /** метод поиска сотрудника по имени**/
    @Override
    public void searchEmployeeByName(List<Employee> list, String name) {
        //String result = list.stream().filter(employee -> employee.getName().equals(name)).map(Employee::getName).findAny().orElse("Employee not found");
         list.stream().filter(employee -> employee.getName().equals(name)).forEach(employee -> System.out.println("по заданному имени: "
                 + name + "\n" + "Найден сотрудник с номером телефона: " + "\n" + employee.getPhone() + "\n"));

    }

}
