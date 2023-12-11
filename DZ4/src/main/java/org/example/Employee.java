package org.example;

import java.util.List;

public class Employee extends AbstracktEmployee<Employee>
{
    public Employee(int tabel, String phone, String name, int seniority)
    {
        super(tabel, phone, name, seniority);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("табель: ").append(getTabel()).append("\n");
        sb.append("телефон: ").append(getPhone()).append("\n");
        sb.append("имя: ").append(getName()).append("\n");
        sb.append("стаж: ").append(getSeniority()).append("\n");
        return sb.toString();
    }
}