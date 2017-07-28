package com.company.chapter4.pack;

public class C4Q16 {
    public static long square(int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }

    public static void question16() {
        int value = 9; // здесь value принимает значение 9
        long result = square(value); // здесь value передаётся в метод
        System.out.println(value); // здесь выводится на экран значение value, оно нигде не менялось
    }
}
