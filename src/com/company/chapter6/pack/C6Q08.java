package com.company.chapter6.pack;

public class C6Q08 {
    public static int question8() {
        int a = 0;
        int b = 0;
//        try {
//            return a / b;
//        } catch (RuntimeException e) {
//            return -1;
//        } catch (ArithmeticException e) {
//            return 0;
//        } finally {
//            System.out.print("done");
//        }
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return -1;
        } catch (RuntimeException e) {
            return 0;
        } finally {
            System.out.print("done");
        }
    }
}
