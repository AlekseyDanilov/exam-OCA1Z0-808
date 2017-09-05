package com.company.testquestions.pack;

public class TQ23 {
    public static void question23() {
        boolean[] b1 = new boolean[2];
        System.out.println("boolean");
        for (int i = 0; i < b1.length; i++) {
            System.out.println("b = " + b1[i]);
        }
        System.out.println("int");
        int[] i1 = new int[2];
        for (int i = 0; i < i1.length; i++) {
            System.out.println("i = " + i1[i]);
        }
        boolean[] b2 = {true, false};
        System.out.println("" + (b1[0] == b2[0]) + ", " + (b1[1] == b2[1]));
    }
}
// Здесь нужно знать и понимать то, что когда мы создаём новый массив и определяем его длину, но не заполняем,
// массив атоматически заполняется в зависимости от типа данных дефолтным значением. Для boolean это false, для
// Object это null, и для примитивных числовых типов это 0.
// причем в отличие от переменной, массив заполняется по умолчанию даже внутри методе