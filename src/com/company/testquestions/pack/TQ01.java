package com.company.testquestions.pack;

//What will it print when run?

public class TQ01 {
    public static void question1() {
        int i = 1234567890;
        float f = i;
        System.out.println(i - (int)f); // -46. Это связано с тем, что информация была потеряна во время преобразования
        // из типа int в тип float, поскольку значения типа float не точны до девяти знаков.
    }
}
