package com.company.chapter3.pack;

/**
 * Created by Данилов on 24.07.2017.
 */
public class C3Q06 {

            public void roar(String roar1, StringBuilder roar2) {
                roar1.concat("!!!"); // String immutable, не изменится.
                roar2.append("!!!"); // StringBuilder добавит знаки.
            }
            public static void question6(){
                String roar1 = "roar";
                StringBuilder roar2 = new StringBuilder("roar");
                new C3Q06().roar(roar1, roar2);
                System.out.println(roar1 + " " + roar2);
            }
}
