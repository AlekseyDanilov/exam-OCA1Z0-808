package com.company.chapter5.pack;

interface Aquatic {
    // public default int getNumberOfGills(int input)
    public default Number getNumberOfGills(int input) {
        return 2;
    }
}

public class C5Q18 implements Aquatic {
    public String getNumberOfGills() { //здесь overloading, а не overriding, поэтому допускается такое написание
        return "4";
    }

    // public String getNumberOfGills(int input) {
    public Integer getNumberOfGills(int input) {
        return 6;
    }

    public static void question18() {
        System.out.println(new C5Q18().getNumberOfGills(-1));
    }
}
