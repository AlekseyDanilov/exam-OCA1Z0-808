package com.company.chapter2.pack;

/**
 * Created by Данилов on 23.07.2017.
 */
public class C2Q20 {
    public static void question20(){
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch(grade) {
            case a:
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break;
            case d:
            case 'F': System.out.print("not good");
            }
        System.out.println();
        switch(grade) {
            case a:
            case 'B': System.out.print("great");
            case 'C': System.out.print("good");
            case d:
            case 'F': System.out.print("not good");
        }
    }
}
