package com.company.testquestions.pack;

public class TQ11 {
        private int myValue = 0;

        public void showOne(int myValue){
            myValue = myValue; // здесь мы приравниваем к нулю
        }

        public void showTwo(int myValue){
            this.myValue = myValue; // здесь мы приравниваем к передаваемому значению
        }
        public static void question11() {
            TQ11 ct = new TQ11();
            ct.showOne(100);
            System.out.println(ct.myValue); // печатаем ноль
            ct.showTwo(200);
            System.out.println(ct.myValue); // печатаем 200
        }
}