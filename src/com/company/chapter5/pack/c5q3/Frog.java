package com.company.chapter5.pack.c5q3;

public class Frog implements CanHop {
    public static void main(String[] args) {
        Frog frog1 = new TurtleFrog(); //вариант A
        TurtleFrog frog2 = new TurtleFrog(); //вариант B
        // BrazilianHornedFrog frog3 = new TurtleFrog(); вариант C
        CanHop frog4 = new TurtleFrog(); //вариант D
        Object frog5 = new TurtleFrog(); //вариант E
        // Long frog6 = new TurtleFrog(); вариант F

         }
}
