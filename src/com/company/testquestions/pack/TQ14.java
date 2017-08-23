package com.company.testquestions.pack;

public class TQ14 {
    public static void question14() {
        int c = 0;
        A:
        for (int i = 0; i < 2; i++) {
            B:
            for (int j = 0; j < 2; j++) {
                C:
                for (int k = 0; k < 3; k++) { //сперва обрабатываем этот цикл, c = 2, k = 1
                    // затем j становится единицей, а k возвращается к исходному значению, в итоге с = 5,
                    // затем j становится 2 и мы выходим из этого цикла и идем в цикл выше, i становится равно 1, j = 0,
                    // k=0, c=6, затем k = 1 , j = 0, с = 7; Затем j = 1 , k = 0, c = 8, так как k < j, то
                    // j=1, k =1 , c = 9; И наконец j = 1, k = 2, c = 10. Всё.
                    c++;
                    if (k > j) break;
                }
            }
        }
        System.out.println(c);
    }
}