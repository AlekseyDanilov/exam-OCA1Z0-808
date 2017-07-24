package com.company.chapter3.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Данилов on 24.07.2017.
 */
public class C3Q23 {
    public static void question23(){
        List<Integer> list = Arrays.asList(10, 4, -1, 5); //создаётся список, который содержит четыре значения
        Collections.sort(list); // Метод сортирует данный список по возрастанию
        Integer array[] = list.toArray(new Integer[4]); // мы создаём массив размером 4, и передаём в него
        // отсортированный список
        System.out.println(array[0]); // здесь мы передаём на выходные данные нулевой элемент массива
    }
}
