package org.example;

public class Calculator {

        public double add(double num1, double num2) {
            return num1 + num2;
        }

        public double subtract(double num1, double num2) {
            return num1 - num2;
        }

        public double multiply(double num1, double num2) {
            return num1 * num2;
        }

        public double divide(double num1, double num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException("Division by zero is not permitted");
            }
            return num1 / num2;
        }
}
