package com.company.chapter3.pack;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Данилов on 25.07.2017.
 */
public class C3Q31 {
    public static void question31(){
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

        System.out.println();

        LocalDate date1 = LocalDate.of(2018, Month.APRIL, 30);
        date1 = date1.plusDays(2);
        date1 = date1.plusYears(3);
        System.out.println(date1.getYear() + " " + date1.getMonth() + " " + date1.getDayOfMonth());
    }
}
