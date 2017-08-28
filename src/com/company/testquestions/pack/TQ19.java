package com.company.testquestions.pack;

public class TQ19 {
    public static void question19() {
        System.out.println("Если передаваемое значение будет false: ");
        ifTest(false);
        System.out.println();
        System.out.println("Если передаваемое значение будет true: ");
        ifTest(true);
    }

    public static void ifTest(boolean flag) {
        if (flag) if (flag) System.out.println("True False");
        else System.out.println("True True"); // Мы никогда не попадём сюда
        else System.out.println("False False");
    }
}
