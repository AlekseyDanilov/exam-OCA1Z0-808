package com.company.chapter4.pack.c4q11;

/**
 * Created by Данилов on 26.07.2017.
 */
public class Rope {
    public static void swing() {
        System.out.print("swing ");
    }

    public void climb() {
        System.out.println("climb ");
    }

    public static void play() {
        swing();
        //climb(); если удалить эту строку, на которой ошибка компиляции, то всё заработает
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();
    }
}
