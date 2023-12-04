package CallingScanner;

import java.util.Scanner;

public  class CallingScanner
{
    public double collingScannerNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        Double number = scanner.nextDouble();
        return number;
    }
    public Integer collingScannerOperations()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
