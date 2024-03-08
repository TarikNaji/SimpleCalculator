package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UI ui = new UI(calculator);
        try {
            ui.start();
        } finally {
            ui.close();
        }
    }
}
