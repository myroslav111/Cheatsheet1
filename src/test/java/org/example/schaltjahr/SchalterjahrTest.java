package org.example.schaltjahr;

public class SchalterjahrTest {

    public static void runTest(){
        if (Schaltjahr.istSchaltjahr(2024)) {
            System.out.println("Test 1 ist Erfolg");
        }else {
            System.out.println("Test 1 ist Versagen");
        }
        if (Schaltjahr.istSchaltjahr(2000)) {
            System.out.println("Test 2 ist Erfolg");
        }else {
            System.out.println("Test 2 ist Versagen");
        }
        if (!Schaltjahr.istSchaltjahr(2023)) {
            System.out.println("Test 3 ist Erfolg");
        }else {
            System.out.println("Test 3 ist Versagen");
        }
        if (!Schaltjahr.istSchaltjahr(1900)) {
            System.out.println("Test 4 ist Erfolg");
        }else {
            System.out.println("Test 4 ist Versagen");
        }

    }

    public static void main(String[] args) {

        runTest();

    }
}
