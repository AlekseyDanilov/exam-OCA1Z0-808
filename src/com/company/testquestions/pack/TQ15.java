package com.company.testquestions.pack;

public class TQ15 {
    public static void question15() {
        int count = 0, sum = 0;
        do {
            if (count % 3 == 0) continue; // если count поделить по модулю на три, и ответ будет равен нулю, то
            // берется следующее число, значит сумма будет равна 1+2+4+5+7+8+10+11 = 48.
            sum += count;
        }
        while (count++ < 11);
        System.out.println(sum);
    }
}