package com.company.testquestions.pack;

public class TQ28 {
    public static void question28() {
        int[] n = {1};
        incr(n);
        System.out.println(n[0]);
    }

    public static void incr(int[] n) {
        n[0]++;
    }
}
// Здесь хочу показать, что такая запись допустима, и n[0]++ отработает.