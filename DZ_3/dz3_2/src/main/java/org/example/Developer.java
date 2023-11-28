package org.example;

import java.util.ArrayList;

public abstract class Developer implements DutiesOfDeveloper
{
    ArrayList<Developer> developers;
    int id;
    public  String Name;
    public  String Surname;
    public  int age;
    public Vacation vacaition;
    static int count = 0;

    {
        id = ++count;
        developers = new ArrayList<>();
    }

    //region Setter & Getter
    public Vacation getVacaition() {
        return vacaition;
    }

    public void setVacaition(Vacation vacaition) {
        this.vacaition = vacaition;
    }
    //endregion

    //region constructor
    public Developer(String name, String surname, int age, Vacation vacaition)
    {
        this.Name = name;
        this.Surname = surname;
        this.age = age;
        this.vacaition = vacaition;
        developers.add(this);

    }
    //endregion

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("имя: ").append(Name).append("\n");
        sb.append("фамилия: ").append(Surname).append("\n");
        sb.append("возраст: ").append(age).append("\n");
        sb.append("должность: ").append(vacaition);
        return sb.toString();
    }

    @Override
    public void working() {
        for(Developer developer : developers)
        {
            if(developer instanceof Backend)
                ((Backend) developer).workingBackend();
            else if (developer instanceof Frontend)
            {
                ((Frontend) developer).workingFrontend();
            }
            else if (developer instanceof Fullstack)
            {
                ((Fullstack) developer).workingFullstack();
                ((Fullstack) developer).workingBackend();
                ((Fullstack) developer).workingFrontend();
            }
        }
    }
}
