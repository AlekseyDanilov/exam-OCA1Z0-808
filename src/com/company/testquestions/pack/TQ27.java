package com.company.testquestions.pack;

public class TQ27 {
    String global = "111";

    public int parse(String arg) {
        int value = 0;
        try {
            String global = arg;
            value = Integer.parseInt(global);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        System.out.print(global + " " + value + " ");
        return value;
    }

    public static void question27() {
        TQ27 ct = new TQ27();
        System.out.print(ct.parse("333"));
    }
}
