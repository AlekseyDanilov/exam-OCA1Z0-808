package com.company.chapter5.pack;

//Это задача из пятой главы на порядок вызова конструкторов. Надо знать, что В Java родительский конструктор всегда
//выполняется перед дочерним конструктором.

class Primate {
    public Primate() {
        System.out.println("Primate");
    }
}

class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }
}

public class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee(); // когда создаётся новый объект класса "Шимпанзе", компилятор автоматичсеки создаёт конструктор
        // по умолчанию вместе с super() методом, который вызывает конструктор родительского класса "Обезьяна"
        // который, в первую очередь, так как наследуется от класса "Приматы", вызывает конструктор этого класса.
        // соответственно компилятор сначала напечатает "Primate", а уже потом "Ape".
    }
}
