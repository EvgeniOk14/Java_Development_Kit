package org.example;

public class TaskMulty implements Runnable {
    private final int leftOperand;
    private final int rightOperand;
    private final String operation;

    public TaskMulty(int leftOperand, int rightOperand, String operation) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operation = operation;
    }

    @Override
    public void run() {
        int result = performOperation();
        System.out.println(result);
    }

    private int performOperation() {
        switch (operation) {
            case "+":
                return leftOperand + rightOperand;
            case "-":
                return leftOperand - rightOperand;
            case "*":
                return leftOperand * rightOperand;
            case "/":
                if (rightOperand != 0) {
                    return leftOperand / rightOperand;
                } else {
                    System.err.println("Error: Division by zero");
                    return 0; // Возвращаем 0 в случае ошибки деления на ноль
                }
            default:
                System.err.println("Error: Unknown operation");
                return 0; // Возвращаем 0 в случае неизвестной операции
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "leftOperand=" + leftOperand +
                ", rightOperand=" + rightOperand +
                ", operation='" + operation + '\'' +
                '}';
    }
}
