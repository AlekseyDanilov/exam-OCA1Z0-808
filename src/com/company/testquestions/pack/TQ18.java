package com.company.testquestions.pack;

public class TQ18 {
    static boolean a;
    static boolean b;
    static boolean c;

    public static void question18() {
        boolean bool = (a = true) || (b = true) && (c = true); // так как Java анализирует выражение слева направо, то
        // как только он понимает, что левый операнд условного оператора «или» оценивается как истинный, он не
        // пытается оценивать дальше. По дефолту a, b и с содержат "false", "a" у нас поменялась, остальные уже нет.
        System.out.print(a + ", " + b + ", " + c);
    }
}