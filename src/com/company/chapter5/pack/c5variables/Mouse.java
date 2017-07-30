package com.company.chapter5.pack.c5variables;

public class Mouse extends Rodent {
    protected int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
        //Если вы ссылаетесь на переменную из родительского класса, используется переменная,
        // определенная в родительском классе. Кроме того, если вы ссылаетесь на переменную из дочернего класса,
        // используется переменная, определенная в дочернем классе.
    }
}
