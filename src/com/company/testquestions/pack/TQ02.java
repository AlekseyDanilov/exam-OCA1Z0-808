package com.company.testquestions.pack;

public class TQ02 {
    public static void question2() {
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;

        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        // System.out.println(i1 == b1); (java: incomparable types: java.lang.Integer and java.lang.Byte)
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(g1));
        System.out.println(i1.equals(b1));
    }
}