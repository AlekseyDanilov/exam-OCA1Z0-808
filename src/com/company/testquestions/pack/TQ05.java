package com.company.testquestions.pack;

public class TQ05 {
        public static void question5() {
            int i = 0;
            boolean bool1 = true;
            boolean bool2 = false;
            boolean bool = false;
            bool = (bool2 & method1(i++));
            bool = (bool2 && method1(i++)); // здесь не вызывается метод, и значение i не увеличивается.
            bool = (bool1 | method1(i++));
            bool = (bool1 || method1(i++)); // здесь не вызывается метод, и значение i не увеличивается.
            System.out.println(i);
        }

        public static boolean method1(int i) {
            return i > 0 ? true : false;
        }
    }
