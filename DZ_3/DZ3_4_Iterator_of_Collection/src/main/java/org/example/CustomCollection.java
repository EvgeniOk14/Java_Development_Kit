package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CustomCollection<T> implements Iterable<T>
{
    private List<T> elements = new ArrayList<>();

    public void add(T element)
    {
        elements.add(element);
    }

    @Override
    public Iterator<T> iterator()
    {
        return new CustomIterator();
    }

    /** Внутренний класс итератора **/
    private class CustomIterator implements Iterator<T>
    {
        private int currentIndex = 0;

        @Override
        public boolean hasNext()
        {
            return currentIndex < elements.size();
        }

        @Override
        public T next()
        {
            return elements.get(currentIndex++);
        }
    }
}