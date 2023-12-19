package org.example;

public class TaskSum implements Runnable {
    private final int operand1;
    private final int operand2;

    public TaskSum(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public void run() {
        int result = operand1 + operand2;
        System.out.println("Sum: " + result);
    }

    @Override
    public String toString() {
        return "Task{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                '}';
    }
}
