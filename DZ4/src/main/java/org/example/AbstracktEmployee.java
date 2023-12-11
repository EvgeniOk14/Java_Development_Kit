package org.example;

import java.util.List;

public abstract class AbstracktEmployee<T extends AbstracktEmployee<T>>
{
    private int tabel;
    private String phone;
    private String name;
    private int seniority;

     public <T> AbstracktEmployee(int tabel, String phone, String name, int seniority)
    {
        this.tabel = tabel;
        this.phone = phone;
        this.name = name;
        this.seniority = seniority;
    }

    public int getTabel()
    {
        return tabel;
    }

    public void setTabel(int tabel)
    {
        this.tabel = tabel;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSeniority()
    {
        return seniority;
    }

    public void setSeniority(int seniority)
    {
        this.seniority = seniority;
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

