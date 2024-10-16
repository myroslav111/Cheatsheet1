package org.example.abstractClass.animal;

public class Dog extends Animal{

    public Dog(String name, int alt){
        this.name = name;
        this.alt = alt;
    }

    @Override
    public void makeLarm(){

        System.out.println("Wov Wov");
    }
}
