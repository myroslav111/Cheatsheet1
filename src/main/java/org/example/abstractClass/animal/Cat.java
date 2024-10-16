package org.example.abstractClass.animal;

public class Cat extends Animal{


    public Cat(String name, int alt){
        this.name = name;
        this.alt = alt;
    }

    public void makeLarm(){

        System.out.println("ich will essen");
    }
}
