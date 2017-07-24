package com.company.chapter3.pack;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Данилов on 24.07.2017.
 */
public class C3Q24 {
    public static void question24(){
//        String [] names = {"Tom", "Dick", "Harry"};
//        List<String> list = names.asList(); Здесь неверно вызван метод asList, будет ошибка компиляции
//        list.set(0, "Sue");
//        System.out.println(names[0]);

        String [] names = {"Tom", "Dick", "Harry"};
        List<String> list = Arrays.asList(names);
        list.set(0, "Sue");
        System.out.println(names[0]);
    }
}
