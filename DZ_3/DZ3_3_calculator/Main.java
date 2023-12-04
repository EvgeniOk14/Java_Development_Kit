import ClassCalculator.Calculator;
import OperationsWithNumbers.*;
import Service.Service;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        Service service = new Service(list);
        service.start(list);
    }
}
