package com.company.testquestions.pack;

public class TQ30 {
    public static void question30() {
        ifTest(false);
    }

    public static void ifTest(boolean flag) {
        if (flag) { //1
            if (flag) {  //2
                if (flag)   //3
                    System.out.println("False True");
                else        // относится к 3
                    System.out.println("True False");
            } else        // относится ко второй
                System.out.println("True True");
        } else        // относится к 1
            System.out.println("False False");
    }
}
