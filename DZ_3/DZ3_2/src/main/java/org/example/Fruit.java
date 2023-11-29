package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Fruit implements Weight, CompareBox, InterfaceBox
{
    //region field
    public float weight;
    //endregion

    //region constructor
    public float getWeight()
    {
        return weight;
    }
    //endregion

    /** переопределение вывода в консоль **/
    @Override
    public String toString()
    {
        return "Apple{ " +
                "weight=" + weight + " }";
    }

    /** наполнения ящика фруктами **/
    @Override
    public List putInBoxFuits(Fruit fruit, int qauntity)
    {
        List<Fruit> fruitList = new ArrayList<>();
        for (int i = 0; i < qauntity; i++)
        {
            fruitList.add(fruit);
        }
        return (List) fruitList;
    }


}
