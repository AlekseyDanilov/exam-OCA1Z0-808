package com.company.chapter3.pack;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by Данилов on 25.07.2017.
 */
public class C3Q33 {
    public static void question33(){
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2); // здесь период принимает только значение ofYears
        //Period p1 = Period.ofDays(1);
        d = d.minus(p);
        //d = d.minus(p1);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));
    }
}
