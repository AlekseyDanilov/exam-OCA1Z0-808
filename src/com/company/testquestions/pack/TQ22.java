package com.company.testquestions.pack;

public class TQ22 {
    static String url = "jdbc://derby://localhost:1527//mydb";

    static TQ22 getDatabase() {
        System.out.println("Getting DB");
        return null;

    }

    public static void question22() {
        System.out.println(getDatabase().url); // хоть мы и возвращаем null, но она принадлежит классу TQ22, а
        // так как обращение к статической переменной происходит через класс, то мы обращаемся к String url
        // без ошибок компиляции и прочего.
        System.out.println(((TQ22) null).url);
    }
}