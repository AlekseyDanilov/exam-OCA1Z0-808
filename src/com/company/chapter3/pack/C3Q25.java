package com.company.chapter3.pack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Данилов on 24.07.2017.
 */
public class C3Q25 {
    public static void question25(){
        List<String> hex = Arrays.asList("30", "8", "3A", "FF"); //создаем список элементов Стринг
        Collections.sort(hex); //сортируем его
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);
    }
}
