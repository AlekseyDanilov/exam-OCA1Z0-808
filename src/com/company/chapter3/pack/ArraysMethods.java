package com.company.chapter3.pack;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Данилов on 20.07.2017.
 */
public class ArraysMethods {
    public static void methods(){

        //ArrayList method add() добавляет в массив элемент

        List<String> list6 = new ArrayList<>();
        //ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE

        List<String> birds1 = new ArrayList<>();
        birds1.add("hawk"); // [hawk]
        birds1.add(1, "robin"); // [hawk, robin]
        birds1.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds1.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds1); // [blue jay, cardinal, hawk, robin]
        System.out.println();

        //remove() удаляет элемент из массива

        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk"); // [hawk]
        birds2.add("hawk"); // [hawk, hawk]
        System.out.println(birds2.remove("cardinal")); // prints false
        System.out.println(birds2.remove("hawk")); // prints true
        System.out.println(birds2.remove(0)); // prints hawk
        System.out.println(birds2); // []
        System.out.println();

        //set() метод меняет значение на новое

        List<String> birds3 = new ArrayList<>();
        birds3.add("hawk"); // [hawk]
        System.out.println(birds3.size()); // 1
        birds3.set(0, "robin"); // [robin]
        System.out.println(birds3.size()); // 1
        //birds3.set(1, "robin"); // IndexOutOfBoundsException
        System.out.println(birds3);
        System.out.println();

        //isEmpty() and size() метод isEmpty() проверяет пустой массив или нет, и выдает true or false
        // метод size() выдает размер массива.

        List<String> birds6 = new ArrayList<>();
        System.out.println(birds6.isEmpty()); // true
        System.out.println(birds6.size()); // 0
        birds6.add("hawk"); // [hawk]
        birds6.add("hawk"); // [hawk, hawk]
        System.out.println(birds6.isEmpty()); // false
        System.out.println(birds6.size()); // 2
        System.out.println();

        //clear() метод удаляет все элементы массива

        List<String> birds7 = new ArrayList<>();
        birds7.add("hawk"); // [hawk]
        birds7.add("hawk"); // [hawk, hawk]
        System.out.println(birds7.isEmpty()); // false
        System.out.println(birds7.size()); // 2
        birds7.clear(); // []
        System.out.println(birds7.isEmpty()); // true
        System.out.println(birds7.size()); // 0
        System.out.println();

        //contains() метод проверяет содержит ли массив такой элемент

        List<String> birds8 = new ArrayList<>();
        birds8.add("hawk"); // [hawk]
        System.out.println(birds8.contains("hawk")); // true
        System.out.println(birds8.contains("robin")); // false
        System.out.println();

        //equals() метод сравнения двух массивов выдает true or false

        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two)); // true
        one.add("a"); // [a]
        System.out.println(one.equals(two)); // false
        two.add("a"); // [a]
        System.out.println(one.equals(two)); // true
        one.add("b"); // [a,b]
        two.add(0, "b"); // [b,a]
        System.out.println(one.equals(two)); // false
        System.out.println();

        // Немного про отображение даты в Java8

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(f.format(LocalDate.now()));
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

    }
}
