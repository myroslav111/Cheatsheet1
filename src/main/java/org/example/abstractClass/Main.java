package org.example.abstractClass;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Bin", 15);
        Cat cat = new Cat("Murka", 10);

        dog.makeLarm();
        cat.makeLarm();
        cat.gehen();
        dog.gehen();


    }
}
