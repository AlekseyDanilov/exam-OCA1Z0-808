package com.company.testquestions.pack;

public class TQ29 {
    public static void question29() {
        try {
            RuntimeException re = null;
            throw re;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
// Будет напечатано java.lang.NullPointerException