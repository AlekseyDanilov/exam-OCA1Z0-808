package com.company.testquestions.pack;

public class TQ13 {
    public static void question13() {
        int x = 0;
        labelA:
        for (int i = 10; i < 0; i--) { // пока i меньше нуля цикл выпоняется, но i больше нуля, а это значит что мы не
        // выполняем условия в цикле и сразу переходим к команде печати и печатаем ноль.
            int j = 0;
            labelB:
            while (j < 10) {
                if (j > i) break labelB;
                if (i == j) {
                    x++;
                    continue labelA;
                }
                j++;
            }
            x--;
        }
        System.out.println(x);
    }
}