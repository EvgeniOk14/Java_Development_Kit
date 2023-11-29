package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Box<T extends Weight> implements CompareBox
{
    //region field
    ArrayList<T> fruits;
    //endregion

    //region Constructor
    public Box(ArrayList<T> fruits)
    {
        this.fruits = fruits;
    }
    //endregion

    /** метод получения веса ящмка с фруктами **/
    public float getTotalWeight() {
        float totalWeight = 0;

        for (T fruit : this.fruits) {
            if (fruit != null) {
                totalWeight += fruit.getWeight();
            }
        }
        return totalWeight;
    }

    /** метод сравнивания двух ящиков по весу **/
    @Override
    public boolean compare(Box secondBox)
    {
        return Math.abs(this.getTotalWeight() - secondBox.getTotalWeight()) < 0.001;
    }

    /** Метод пересыпания одной коробки в другую **/
    public void transferFruits(Box<T> destinationBox)
    {
        int count = 0;
        int discount = 0;
        for (int i = 0; i < destinationBox.fruits.size() & count < this.fruits.size(); i++)
        {
            if (destinationBox.fruits.get(i) != null)
            {
                count++;
            } else {
                discount++;
            }
            int freeSells = destinationBox.fruits.size() - discount;
            if (freeSells >= this.fruits.size()) {
                destinationBox.fruits.addAll(this.fruits);
                this.fruits.clear();
            }
            else {
                throw new ArrayIndexOutOfBoundsException("Размер данного ящика не позволяет вместить такое количество фруктов! ");
            }
        }
    }

    /** метод печати содержимого ящика после пересыпания в него содержимого другого ящика **/
    public void printBox(List<Fruit> fruits, Box box)
    {
        System.out.println("Колчество фруктов в ящике после высыпания в него содержимого другого ящика: ");

        for (int i = 0; i < fruits.size(); i++)
        {
            System.out.println(i+1 + ":");
            System.out.println(box.fruits.get(i));
        }
    }
}
