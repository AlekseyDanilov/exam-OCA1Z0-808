package com.company.testquestions.pack;

public class TQ20 {
    public static void question20() {
        java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
        System.out.println(dt);
        }
}
// Так как сначала вычитается месяц, мы получаем 2014-12-01, затем вычитается день, получаем 2014-11-30, и затем
// прибавляется год. И в итоге мы получаем 2015-11-30.