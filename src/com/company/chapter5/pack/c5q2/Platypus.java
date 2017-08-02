package com.company.chapter5.pack.c5q2;

public class Platypus extends Mammal {
    public Platypus() { //будет ошибка компиляции, так как класс от которого мы наследуемся не имеет конструктора по
        // дефолту. Но конструктор класса наследника первым делом вызывает super() без аргументов. Чтобы ошибки не
        // было следует добавить в родительский класс, конструктор без аргументов.
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
