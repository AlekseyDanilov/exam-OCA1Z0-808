package com.company.chapter3.pack;

/**
 * Created by Данилов on 24.07.2017.
 */
public class C3Q05 {
    public static void questions5() {
//        String s1 = "java";
//        StringBuilder s2 = new StringBuilder("java");
//        //if (s1 == s2) Вот в этом участке программа выдаст ошибку.
//            System.out.print("1");
//        if (s1.equals(s2))
//            System.out.print("2");

        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        if (s1 == s2.toString()) // тут false потому что это два разных объекта, хоть теперь и одного типа
            System.out.print("1");
        if (s1.equals(s2.toString())) //тут true потому что содержимое их равно, и типы их одинаковы
            System.out.print("2");
    }
}
