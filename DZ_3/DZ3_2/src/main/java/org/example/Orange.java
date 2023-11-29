package org.example;

public class Orange extends Fruit
{
    //region field
    private static final float weight = 1.5f;
    //endregion

    /** метод сравнения двух ящиков по весу **/
    @Override
    public boolean compare(Box anotherBox)
    {
        return false;
    }

    /** получение веса ящика с фруктами **/
    @Override
    public float getWeight()
    {
        return weight;
    }

    /** переопределения вывода в консоль **/
    @Override
    public String toString() {
        return "Orange{ " +
                "weight=" + weight + " }";
    }
}
