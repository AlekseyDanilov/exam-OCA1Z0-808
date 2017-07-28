package com.company.chapter4.pack.c4q22;

public class OrderDriver {
    public static void main(String[] args) {
        System.out.print(Order.result + " "); // мы ссылаемся на Order впервые. На этом этапе инициализируется статически
        // объявленнные переменнные и статические блоки в порядке их появления в коде.
        System.out.print(Order.result + " ");//результат такой же, потому что статическая инициализация выполняется только один раз.
        new Order(); // так как статический блок уже отработан, то добавяются к "u" два не статических блока во время
        // создания нового объекта класса Order и результат "ucr"
        new Order();// здесь добавляются еще раз "c" и "r"
        System.out.print(Order.result + " ");// тут будет "ucrcr"
    }
}
