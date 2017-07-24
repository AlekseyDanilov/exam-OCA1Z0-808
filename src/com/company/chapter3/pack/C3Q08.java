package com.company.chapter3.pack;

/**
 * Created by Данилов on 24.07.2017.
 */
public class C3Q08 {
    public static void question8() {
        String numbers = "012345678";

        System.out.println(numbers.substring(1, 3)); // метод печатает с 1 по 3 символы, не включая третью, и
        // важно помнить, что отсчёт начинается с нуля.
        System.out.println(numbers.substring(7, 7)); // тут медод ничего не печатает, но и не выдает ошибку.
        System.out.println(numbers.substring(7)); // тут метод печатает с 7 символа и до конца строки.
    }
}
