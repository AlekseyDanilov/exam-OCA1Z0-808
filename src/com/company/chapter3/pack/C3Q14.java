package com.company.chapter3.pack;

/**
 * Created by Данилов on 24.07.2017.
 */
public class C3Q14 {
    public static void question14(){
        System.out.println("Вариант A");
        StringBuilder puzzle1 = new StringBuilder("Java");
        puzzle1.reverse(); //Вариант А
        System.out.println(puzzle1);
        System.out.println();

        System.out.println("Вариант B");
        StringBuilder puzzle2 = new StringBuilder("Java");
        puzzle2.append("vaJ$").substring(0, 4); //Вариант B
        System.out.println(puzzle2);
        System.out.println();

        System.out.println("Вариант C");
        StringBuilder puzzle3 = new StringBuilder("Java");
        puzzle3.append("vaJ$").delete(0, 3).deleteCharAt(puzzle3.length() - 1); //Вариант C
        System.out.println(puzzle3);
        System.out.println();

        System.out.println("Вариант D");
        StringBuilder puzzle4 = new StringBuilder("Java");
        puzzle4.append("vaJ$").delete(0, 3).deleteCharAt(puzzle4.length()); //Вариант D
        System.out.println(puzzle4);
    }
}
