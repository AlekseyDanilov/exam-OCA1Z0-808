package com.company.chapter4.pack;

import java.util.function.Predicate;

public class C4Q26 {
    int age;

    public static void question26() {
        C4Q26 p1 = new C4Q26();
        p1.age = 1;
        check(p1, p -> p.age < 5); //тут мы передаем в метод check данные. Лямбда возврщает true.
    }

    private static void check(C4Q26 panda, Predicate<C4Q26> pred) {
        String result = pred.test(panda) ? "match" : "not match"; // так как лямбда вернула true, то выполняется
        // правая сторона. И result принимает значение match.
        System.out.print(result);
    }
}
