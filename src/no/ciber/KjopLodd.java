package no.ciber;

import java.util.ArrayList;
import java.util.Scanner;

public class KjopLodd {

    public static void kjopFleireLodd() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        ArrayList<Integer> kjoptLoddListe = new ArrayList<Integer>();


        System.out.println("Kva heiter du?");

        String navn = scanner.nextLine();  // Read user input
        System.out.println("Hei " + navn + "!");  // Output user input
        System.out.println("Kor mange lodd ynskjer du å kjøpe?");

        Integer antallLodd = scanner.nextInt();
        for (int i = 1; i <= antallLodd; i++){
            System.out.print("Ledige lodd er:");
            System.out.println(Lodd.ledige);
            System.out.println("Skriv eit lodd du ynskjer å kjøpe:");
            Integer kjoptLodd = scanner.nextInt();

            if (Lodd.ledige.contains(kjoptLodd)){
                Lodd.ledige.remove(kjoptLodd);
                kjoptLoddListe.add(kjoptLodd);
                Lodd.kjopte.put(kjoptLodd,navn);
            }
            else{
                System.out.println("Dette lodded har noken andre kjøpt, velg et annet.");
                i--;
            }
        }
        System.out.println(Lodd.kjopte);
        System.out.println(navn + ", dine lodd er: " + kjoptLoddListe);
        System.out.println("Lykke til!");

    }



}
