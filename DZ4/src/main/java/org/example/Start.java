package org.example;

import java.util.ArrayList;
import java.util.List;

public class Start
{
    public void start()
    {

        /** создаём новых сотрудников **/
        AbstracktEmployee employee1 = new Employee(1, "123", "иван", 5);
        AbstracktEmployee employee2 = new Employee(2, "234", "пётр", 3);
        AbstracktEmployee employee3 = new Employee(3, "345", "василий", 15);
        AbstracktEmployee employee4 = new Employee(4, "567", "николай", 25);
        AbstracktEmployee employee5 = new Employee(5, "678", "кирилл", 1);
        AbstracktEmployee employee6 = new Employee(6, "789", "антон", 8);
        AbstracktEmployee employee7 = new Employee(7, "891", "михаил", 10);

        List<Employee> list = new ArrayList<>();

        AbstractPhoneDirectory phoneDirectory = new PhoneDirectory(list);

        /** метод добавления сотрудников **/
        phoneDirectory.addEmployeeToList(list, employee1);
        phoneDirectory.addEmployeeToList(list, employee2);
        phoneDirectory.addEmployeeToList(list, employee3);
        phoneDirectory.addEmployeeToList(list, employee4);
        phoneDirectory.addEmployeeToList(list, employee5);
        phoneDirectory.addEmployeeToList(list, employee6);
        phoneDirectory.addEmployeeToList(list, employee7);

        /** печатаем сотрудников **/
        phoneDirectory.printEmployee(list);

        /** добавляем существующего сотрудника **/
        phoneDirectory.addEmployeeToList(list, employee1);
        /** печатаем и получаем вывод: "Такой сотрудник уже есть в списке!" **/
        phoneDirectory.printEmployee(list);

        /** вывод номера телефона по имени **/
        phoneDirectory.searchEmployeeByName(list,"николай");

        /** вывод сотрудника по стажу **/
         phoneDirectory.searchEmployeeBySeniority(list, 15);







    }
}
