package com.company.chapter6.pack;

public class C6Q20 {

    public static void question20() {
        System.out.print("a"); //печатаем "a" переходим в try catch блок
        try {
            System.out.print("b"); //печатаем "b"
            throw new IllegalArgumentException(); //выбрасываем исключение
        } catch (IllegalArgumentException e) { // здесь мы его отлавливаем
            System.out.print("c"); // печатаем "c"
            throw new RuntimeException("1"); // выбрасываем исключение и переходим к блоку "finally"
        } catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");
        } finally {
            System.out.print("e"); // печатаем "e"
            throw new RuntimeException("3"); // выбрасываем исключение с описанием "3"
        }
    }
}