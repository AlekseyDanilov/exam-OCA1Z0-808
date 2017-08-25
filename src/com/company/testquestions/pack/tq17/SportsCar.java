package com.company.testquestions.pack.tq17;

class Car {
    public int gearRatio = 8;

    public String accelerate() {
        return "Accelerate : Car";
    }
}

class SportsCar extends Car {
    public int gearRatio = 9;

    public String accelerate() {
        return "Accelerate : SportsCar";
    }

    public static void main(String[] args) {
        Car c =  new SportsCar(); // мы создаём объект класса SportsCar
        System.out.println(c.gearRatio + "  " + c.accelerate()); //Здесь мы обращаемся к переменной класса родителя и
        // к методу класса родителя, но так как метод переопределён в наследуемом классе, то мы обращаемся уже к нему
        // и на выходе мы получаем 8 и "Accelerate : SportsCar", если в классе родителя не было бы метода accelerate, то
        // произошла бы ошибка компиляции
    }
}