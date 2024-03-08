package org.example;

import java.util.Scanner;

public class UI {
    private final Calculator calculator;
    private final Scanner scanner;

    public UI(Calculator calculator) {
        this.calculator = calculator;
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        System.out.println("-----CALCULATOR-----");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        try {
            switch (operator) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, or /");
                    return;
            }

            System.out.println("The result is:");
            System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void close() {
        scanner.close();
    }
}
