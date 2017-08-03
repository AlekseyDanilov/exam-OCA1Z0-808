package com.company.chapter6.pack;

public class C6Q11 {
    public String name;

    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        } catch (NullPointerException e) {
            System.out.print("4");
        }
        System.out.print("5");
    }

    public static void question11() {
        C6Q11 leo = new C6Q11();
        leo.name = "Leo";
        leo.parseName();
        System.out.print("6");
    }
}
