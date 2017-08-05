package com.company.testquestions.pack;

public class TQ07 {
    public static void question7() {
        int k = 1;
        int[] a = {1};
        k += (k = 4) * (k + 2); // k принимает значение 4, и потом умножает его на два, и умножает 6*4, и плюс 1
        a[0] += (a[0] = 4) * (a[0] + 2); //  здесь происходит то же самое.
        System.out.println(k + " , " + a[0]);
    }
}
