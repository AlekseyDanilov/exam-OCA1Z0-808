package com.company.chapter6.pack;

public class C6Q7 {
    public void go() {
        System.out.print("A"); // начало обработки метода
        try {
            stop(); //обращение к методу "stop"
        } catch (ArithmeticException e) {  // так как этот блок выполняется только при ArithmeticException, а унас
            // NullPointerException, то этот блок не выполнится, выполнится блок finally, напечататся "C"
            // и программа выбросит ошибку NullPointerException. Больше ничего не напечатается.
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public void stop() {
        System.out.print("E"); // печать символа "E"
        Object x = null;
        x.toString(); // обращение метода toString к нулевому объекту, вызовет NullPointerException.
        System.out.print("F");
    }

    public static void question7() {
        new C6Q7().go();
    }
}