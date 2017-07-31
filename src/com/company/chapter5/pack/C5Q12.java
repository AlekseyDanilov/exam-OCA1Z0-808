package com.company.chapter5.pack;

interface Nocturnal {
    default boolean isBlind() {
        return true;
    }
}

public class C5Q12 implements Nocturnal {
    public boolean isBlind() {
        return false;
    }

    public static void question12() {
        Nocturnal nocturnal = (Nocturnal) new C5Q12();
        System.out.println(nocturnal.isBlind());
    }
}
