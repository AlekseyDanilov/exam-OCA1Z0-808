package com.company.chapter3.pack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Данилов on 20.07.2017.
 * Здесь представлены и описаны методы класса String и StringBuilder
 */
public class Chap3 {
    public static void stringMethod(){
        String s = "Animals";

        //Метод length() определяет количество символов. Пробел - тоже символ)
        System.out.println(s.length());//7
        System.out.println();

        //charAt(int индекс) показывает какой символ под этим индексом
        System.out.println(s.charAt(0)); // A
        System.out.println(s.charAt(6)); // s
        System.out.println();

        //indexOf() обратная сторона charAt, показывает какой индекс у символа. При этом можно написать
        // откуда ему начинать, так как он показывает первый совпавший символ.

        System.out.println(s.indexOf('A')); // 0
        System.out.println(s.indexOf("al")); // 4
        System.out.println(s.indexOf('a', 4)); // 4
        System.out.println(s.indexOf("al", 5)); // -1
        System.out.println();

        // substring() метод который берет значение в скобках и от этого индекса пишет строку, так же можно задать
        // параметр до какого значения ему писать эту строку.

        System.out.println(s.substring(1, 3)); // ni
        System.out.println(s.substring(s.indexOf('m'))); // mals
        System.out.println(s.substring(4, 7)); //als
        System.out.println(s.substring(7)); // empty
        System.out.println();

        /*System.out.println(s.substring(3, 3)); // empty string
        System.out.println(s.substring(3, 2)); // throws exception
        System.out.println(s.substring(3, 8)); // throws exception
*/
        //toLoweCase() and toUpperCase длеает все буквы маленькими/большими.

        System.out.println(s.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123
        System.out.println(s);
        System.out.println();

        //equals() and equalsIgnoreCase() метод сравнивает значения и выдает true or false.

        System.out.println(s.equals("Animals")); // true
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true
        System.out.println();

        //startsWith() and endsWith() метод проверяет действительно ли с этого символа началась строка
        // и действительно ли этим символом она закончилась и выдает true or false.

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false
        System.out.println();

        //contains() содержит ли строка данный символ
        System.out.println(s.contains("a")); // true
        System.out.println("abc".contains("B")); // false
        System.out.println();

        //replace() меняет символ на другой

        System.out.println(s.replace('a', 'A')); // AnimAls
        System.out.println(s.replace("s", "S")); // AnimalS
        System.out.println();

        //trim() если есть табуляция и используется \t, но потом пишется метод trim(), то пробела не будет в начале.

        System.out.println("\t a b c\n d");
        System.out.println("\t a b c\n d".trim());
        System.out.println("         hey".trim());
        System.out.println();


        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
        alpha += current;
        System.out.println(alpha);
        System.out.println();

        //StringBuilder

        StringBuilder sb = new StringBuilder("Buider");
        sb.insert(0, "-");
        System.out.println(sb);
        System.out.println();

        //Метод delete() and deleteCharAt()

        StringBuilder sb2 = new StringBuilder("abcdef");
        sb2.deleteCharAt(5); // удалит f
        sb2.delete(1, 3); // sb = ade
        System.out.println(sb2);
        System.out.println();

        //reverse() меняет местами

        StringBuilder sb3 = new StringBuilder("Aleksey");
        sb3.reverse();
        System.out.println(sb3);
        System.out.println();

        //Arrays
//
//        int[] numbers = new int[10];
//        for (int i = 0; i < numbers.length; i++){
//        numbers[i] = i + 5;}
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }


    }
}
