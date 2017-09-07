package com.company.testquestions.pack;

public class TQ25 {

    public static void quesion25() {
        //String condition = "1"; Такая запись недопустима, так как case содержат значение int.
        //int condition = 1; Так мы понятное дело можем написать
        Integer condition = new Integer(1); // мы можем написать и так, это не приведет к ошибке
        switch (condition) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
        }
    }
}