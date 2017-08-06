package com.company.testquestions.pack;

public class TQ10 {
    public static void question10() {
        int x = 10, y = 20;
        int dx, dy;
        try {
            dx = x % 5; //результат деления по модулю будет dx = 10 % 5 = 0;
            dy = y / dx; // Здесь мы пытаемся поделить на 0, это приводит к ArithmeticException;
        } catch (ArithmeticException ae) {
            System.out.println("Caught AE"); // печатаем строку;
            dx = 2; // приравниваем dx к 2;
            dy = y / dx; // dy = 20 / 2; dy = 10;
        }
        x = x / dx; // x = 10 / 2 = 5;
        y = y / dy; // y = 20 / 10 = 2;
        System.out.println(dx + " " + dy); // печатаем 2 и 10;
        System.out.println(x + " " + y); // печатаем 5 и 2;
    }
}