package org.example;

public abstract class GenericArray<T> implements inteffaceArray
{
    //region field
    private Object[] array;
    //endregion

    //region cpnstructor
    public GenericArray(int size)
    {
        this.array = new Object[size];
    }
    //endregion

    public void set(int index, T value) // назначение значения "value" элементу массива с индексом номер: "index"
    {
        array[index] = value;
    }

    public T get(int index)  // получение элемента массива по заданному индексу
    {
        return (T) array[index];
    }

    public T[] getArray()  // получение массива
    {
        return  (T[]) array;
    }

    @Override // замена двух элементов массива по их индексам
    public void swapTwoElements(int index1, int index2)
    {
        T temp = get(index1);
        set(index1, get(index2));
        set(index2 , temp);
    }
    @Override
    public void printArray() // печать массива
    {
        for(T value : getArray())
        {
            System.out.println(value + " ");
        }
    }
}
