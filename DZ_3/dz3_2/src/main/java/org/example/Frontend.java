package org.example;

import java.util.ArrayList;

public class Frontend  extends Developer implements InterfaceFrontend
{

    public Frontend(String name, String surname, int age, Vacation vacaition)
    {
        super(name, surname, age, vacaition);

    }

    @Override
    public void workingFrontend()
    {
        System.out.println("Working Frontend! ");
    }

    @Override
    public void working()
    {
        super.working();
    }

}
