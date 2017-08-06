package com.company.testquestions.pack;

public class TQ09 {
        public static void question9() {
            // for: for(int i = 0; i< 10; i++){ //нельзя использовать 50 ключевых слов запрещенных для наименования
            // и для меток тоже.
            doSomething: for(int i = 0; i< 10; i++){
                for (int j = 0; j< 10; j++){
                    //if ( i+ j > 10 )  break for;
                    if ( i+ j > 10 )  break doSomething;
                }
                System.out.println( "hello");
            }
        }
}
