package org.example;

public class Apple  extends Fruit
{
    //region field
    private static final float weight = 1.0f;
    //endregion

    /** метод сравнивания двух ящиков с фруктами по весу **/
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
    /** переопределение вывода в консоль **/
    @Override
    public String toString() {
        return "Apple{ " +
                "weight=" + weight + " }";
    }

}
