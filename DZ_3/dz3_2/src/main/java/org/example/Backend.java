package org.example;

import java.util.ArrayList;

public class Backend extends Developer implements InterfaceBackend
{


    public Backend(String name, String surname, int age, Vacation vacaition) {
        super(name, surname, age, vacaition);


    }

    @Override
    public void working()
    {
        super.working();
    }

    @Override
    public void workingBackend()
    {
        System.out.println("Working Backend! ");
    }


}
