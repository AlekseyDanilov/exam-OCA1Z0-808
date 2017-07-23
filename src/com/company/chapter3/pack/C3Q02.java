package com.company.chapter3.pack;

/**
 * Created by Данилов on 23.07.2017.
 */
public class C3Q02 {
    public static void question2(){
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");
    }

}
