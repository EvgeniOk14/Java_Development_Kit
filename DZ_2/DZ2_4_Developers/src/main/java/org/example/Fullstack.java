package org.example;

public class Fullstack  extends Developer implements InterfaceFullstack, InterfaceBackend, InterfaceFrontend
{

    public Fullstack(String name, String surname, int age, Vacation vacaition)
    {
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
        System.out.println("I also can Doing Backend! ");
    }

    @Override
    public void workingFrontend()
    {
        System.out.println("I also can Doing Frontend! ");
    }

    @Override
    public void workingFullstack()
    {
        System.out.println("Working Fullstack! ");
    }
}
