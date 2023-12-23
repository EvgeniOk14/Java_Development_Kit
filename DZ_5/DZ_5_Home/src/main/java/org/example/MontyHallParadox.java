package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MontyHallParadox
{
    private static final int NUM_SIMULATIONS = 1000;

    public static void main(String[] args)
    {
        Map<Integer, Boolean> results = new HashMap<>();
        Random random = new Random();

        for (int i = 1; i <= NUM_SIMULATIONS; i++)
        {
            boolean initialChoice = random.nextBoolean();
            boolean switchChoice = random.nextBoolean();

            boolean result = playMontyHallGame(initialChoice, switchChoice);
            results.put(i, result);
        }

        printStatistics(results);
    }

    private static boolean playMontyHallGame(boolean initialChoice, boolean switchChoice)
    {
        int carPosition = randomCarPosition();
        int contestantChoice = initialChoice ? carPosition : 1;

        if (switchChoice)
        {
            return contestantChoice != carPosition;
        }
        else
        {
            return contestantChoice == carPosition;
        }
    }

    private static int randomCarPosition()
    {
        return new Random().nextInt(3) + 1;
    }

    private static void printStatistics(Map<Integer, Boolean> results)
    {
        long positiveResults = results.values().stream().filter(result -> result).count();
        long negativeResults = results.size() - positiveResults;
        double percentagePositive = (double) positiveResults / results.size() * 100;

        System.out.println("Positive Results: " + positiveResults);
        System.out.println("Negative Results: " + negativeResults);
        System.out.println("Percentage Positive: " + percentagePositive + "%");
    }
}
