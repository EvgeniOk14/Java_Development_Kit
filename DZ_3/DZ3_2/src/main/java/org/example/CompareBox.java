package org.example;

public interface CompareBox<T extends Fruit & Weight>
{
    boolean compare(Box<? extends T> anotherBox);
}
