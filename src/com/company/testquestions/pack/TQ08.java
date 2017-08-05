package com.company.testquestions.pack;

public class TQ08 {
    public static void question8(){
        int i = 0, j = 5;
        lab1 : for( ; ; i++){
            for( ; ; --j)  if( i >j ) break lab1;
        }
        System.out.println(" i = "+i+", j = "+j);
/*
        Значения i и j изменяются следующим образом:
        i = 0 j = 5
        i = 0 j = 4
        i = 0 j = 3
        i = 0 j = 2
        i = 0 j = 1
        i = 0 j = 0
        i = 0 j = -1
        Таким образом в итоге будет напечатано i = 0, j = -1
*/
    }
}
