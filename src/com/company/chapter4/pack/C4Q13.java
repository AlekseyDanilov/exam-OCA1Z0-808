package com.company.chapter4.pack;

public class C4Q13 {
    private static final String leftRope;
    private static final String rightRope;
    // private static final String bench;  1 ошибка bench не проинициализированна
    private static final String name = "name";

    static {
        leftRope = "left";
        rightRope = "right";
    }

    static {
        // name = "name"; 2 ошибка переменная name final и уже проинициализированна
        //rightRope = "right"; 3 ошибка переменная right final и уже проинициализированна в static блоке
    }

    public static void main(String[] args) {
        //bench = "bench"; ошибка, так как final пернеменная не проинициализированная
    }
}