package ChangeValuesOfNumbersXY;

import Service.Service;
import java.util.List;
import java.util.ArrayList;

public class ChangeValues
{
    private List list;
    public ChangeValues(List list)
    {
        this.list = list;
    }
    public void changeValues(List list)
    {
        Service service = new Service(list);
        service.start(list);
    }
}
