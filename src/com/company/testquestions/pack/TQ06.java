package com.company.testquestions.pack;

public class TQ06 {
    static int mx(int s) {
        for (int i = 0; i < 3; i++) {
            s = s + i;
        }
        return s;
    }
    public static void question6() {
        int s = 5;
        s += s + mx(s) + ++s;
        System.out.println(s);
        /*s += (expression) will be converted to s =  s + expression.
        So the given expression will become:
        s = s + s + mx(s) + ++s;
        s = 5 + 5 + mx(5) + 6;
        s = 5 + 5+ 8 + 6;
        s = 24;*/
    }
}
