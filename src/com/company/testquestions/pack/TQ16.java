package com.company.testquestions.pack;

public class TQ16 {
    public static void question16() {
        int[][] ab = {{1, 2, 3}, {4, 5}};
        for (int i = 0; i < ab.length; i++) {  // ab.length = 2
            for (int j = 0; j < ab[i].length; j++) { //ab[0].length = 3, ab[1].length = 2
                System.out.print(ab[i][j] + " "); // сначала печатает число
                if (ab[i][j] == 2) { // потом проверяет равно ли оно двум
                    break;
                }
            }
            continue;
        }
    }
}