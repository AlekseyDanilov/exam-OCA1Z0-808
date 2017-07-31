package com.company.chapter5.pack.c5q4;

public class Beaver extends Rodent {
    public static Integer chew() throws RuntimeException { //работает, если поменять местами тип возвращаемого значения
        // и добавить модификатор static, так как этот метод в родительском классе объявлен static.
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}