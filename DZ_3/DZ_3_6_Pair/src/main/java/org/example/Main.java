package org.example;

public class Main
{
    public static void main(String[] args)
    {

        Pair pair = new Pair(3, "text");
        System.out.println(pair.getFirst().toString());
        System.out.println(pair.getSecond().toString());
    }
}