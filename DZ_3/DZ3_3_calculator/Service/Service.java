package Service;

import CallingScanner.CallingScanner;
import ChoiseOperation.ChoiseOperation;
import CorrectInputOfNumber.CorrectInputOfNamber;
import TabloOperation.TabloOperation;
import java.util.List;
import java.security.PublicKey;
import java.util.ArrayList;

public class Service
{
    private List Llist;
    public Service(List list)
    {
        this.Llist = list;
    }

    public void start(List list)
    {
        System.out.println("Ведите первое число X: ");
        CallingScanner callingScannerX = new CallingScanner();
        double x = callingScannerX.collingScannerNumbers();

        System.out.println("Ведите второе число Y: ");
        CallingScanner callingScannerY = new CallingScanner();
        double y = callingScannerY.collingScannerNumbers();


        ChoiseOperation choiseOperation = new ChoiseOperation(x ,y, list);
        choiseOperation.choiseOperation(x, y, list);
    }
}
