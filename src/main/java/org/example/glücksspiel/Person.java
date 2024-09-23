package org.example.glücksspiel;

public class Person {
    int alt;
    String name;
    char geschlecht;

    public Person (int alt, String name, char geschlecht){
        this.alt = alt;
        this.name = name;
        this.geschlecht = geschlecht;
    }

    public void begrüßungPerson(){
        if (this.alt > 18 && this.geschlecht == 'm') {
            System.out.println("Guten Tag Herr " + this.name + " !");
        } else if (this.alt > 18 && this.geschlecht == 'w') {
            System.out.println("Guten Tag Frauu " + this.name + " !");
        } else {
            System.out.println("Hallo " + this.name + " !");

        }
    }

}
