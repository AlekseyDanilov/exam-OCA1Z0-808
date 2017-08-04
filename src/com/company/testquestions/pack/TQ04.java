package com.company.testquestions.pack;

public class TQ04 {
         public static void question4() {
            String[] sa = {"a", "b", "c"};
            for(String s :  sa){
                if("b".equals(s)) continue; // если бы здесь вместо "continue" было бы напсиано "break", то тогда
                // как только мы дошли бы до элемента "b", for:each  был бы завершён полностью, а так как тут
                // написано "continue", мы просто завершаем блок for:each для "b" и переходим к "c".
                System.out.println(s);
                if("b".equals(s)) break;
                System.out.println(s + " again");
            }
        }
    }
