package com.company.testquestions.pack;

public class TQ12 {
    public static void question12() {
        Integer x = new Integer(1);
        // String x = "1"; // если записать таким образом, будет ошщибка на 10 строке.
        switch(x){
            default:
                System.out.println("default");
            case 1:
                System.out.println("correct");
        }
    }
}