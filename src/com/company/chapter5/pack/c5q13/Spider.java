package com.company.chapter5.pack.c5q13;

public class Spider extends Arthropod {
    public void printName(int input) { //overload, а не override, а значит мы можем обратиться к обоим методам
        System.out.print("Spider");
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.printName(4);
        spider.printName(9.0);
    }
}
