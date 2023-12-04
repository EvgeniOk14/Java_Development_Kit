package ClassCalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator
{
    private List list = new ArrayList();
    public Calculator(List list)
    {
        this.list = list;
    }

    public void saveOperation(String input, double result)
    {
        list.add(input + result);
        System.out.println(list);
    }
    public void printList(List list)
    {
        System.out.println(list);
    }
}
