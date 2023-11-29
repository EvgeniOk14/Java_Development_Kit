package org.example;

import java.util.ArrayList;
import java.util.List;

public interface InterfaceBox<T extends List<Fruit>>
{
    List<Fruit> putInBoxFuits(Fruit fruit, int qauntity);
}
