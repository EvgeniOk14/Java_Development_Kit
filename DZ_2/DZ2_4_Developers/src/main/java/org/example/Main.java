package org.example;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        Developer backend =  new Backend("Иван","Иванов", 25, Vacation.BACKEND);
        Developer frontend = new Frontend("Петр", "Петров", 30, Vacation.FRONTEND);
        Developer fullstack = new Fullstack("Сидоров", "Сидор", 35, Vacation.FULLSTACK);

        ArrayList<Developer> developers = new ArrayList<>();

        developers.add(backend);
        developers.add(frontend);
        developers.add(fullstack);

        for (Developer developer : developers)
        {
            System.out.println(developer);
            developer.working();
            System.out.println("\n");
        }
    }
}