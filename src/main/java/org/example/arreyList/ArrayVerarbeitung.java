package org.example.arreyList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayVerarbeitung {

    public void ArrayVerarbeitung(){}

    public static void zahlHinzufugen(ArrayList<Integer> arrayInt, Scanner scanner){
        while (true){
            if (scanner.hasNextInt()) {
                arrayInt.add(scanner.nextInt());
                break;
            }else {
                System.out.println("Fügen Sie bitte Zahlen anstatt Symbol hinzu");
                scanner.next();
            }
        }
    }

    public static void sortiruhngNachOben(ArrayList<Integer> arrayInt){
        //List<Integer> arrSortiertenZahlen = arrayInt.stream().sorted().collect(Collectors.toList());
        //System.out.println(arrSortiertenZahlen);
        
        for (int i = 0; i < arrayInt.size(); i++) {
            for (int j = 0; j < arrayInt.size() - i - 1; j++) {
                if (arrayInt.get(j) > arrayInt.get(j + 1)) {
                    int grosser = arrayInt.get(j);
                    arrayInt.set(j, arrayInt.get(j + 1));
                    arrayInt.set((j + 1), grosser);

                }
            }
        }
        System.out.println(arrayInt);


    }

    public static void sortiruhngNachUnten(ArrayList<Integer> arrayInt){
        for (int i = 0; i < arrayInt.size(); i++) {
            for (int j = 0; j < arrayInt.size() - i - 1; j++) {
                if (arrayInt.get(j) < arrayInt.get(j + 1)) {
                    int grosser = arrayInt.get(j + 1);
                    arrayInt.set((j + 1), arrayInt.get(j));
                    arrayInt.set(j, grosser);

                }
            }
        }
        System.out.println(arrayInt);
    }

    public static void addElementsIntoArrayList(ArrayList<Integer> arrayInt, int[] arr){
        for(int num: arr){
            arrayInt.add(num);
        }
    }

    public static void removeElementsFromArrayList(ArrayList<Integer> arrayInt, Scanner scanner){
        int num = scanner.nextInt();
        boolean gibtEsZahl = false;
        for (int i = 0; i < arrayInt.size(); i++) {
            if (arrayInt.get(i) == num) {
                arrayInt.remove(i);
                gibtEsZahl = true;
            }
        }

        if (gibtEsZahl) {
            System.out.println(arrayInt);
        }else {
            System.out.println("Es gibt keine derartige Nummer in dem Array");
        }

    }
}
