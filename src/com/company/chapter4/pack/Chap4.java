package com.company.chapter4.pack;

/**
 * Created by Данилов on 21.07.2017.
 */
public class Chap4 {

    //public void walk1(int... nums) {    }

    //public void walk2(int start, int... nums) {    }

    //public void walk3(int... nums, int start) { } // DOES NOT COMPILE varargs должен быть последним

    //public void walk4(int... start, int... nums) { } // DOES NOT COMPILE varargs может быть один в методе

    public static String glide(String s) {
        return "1";
    }
    public static String glide(String... s) {
        return "2";
    }
    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String s, String t) {
        return "4";
    }
    public static void print() {
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
    }
}
