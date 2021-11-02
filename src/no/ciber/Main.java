package no.ciber;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Init.init(); // Init new ledige lodd

        while (true){
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Vil du kjøpe lodd? (y/n)");
            String svar = scanner.nextLine();
            if (svar.equalsIgnoreCase("q")){
                break;
            }
            else if (svar.equalsIgnoreCase("y") ){
                KjopLodd.kjopFleireLodd();
            }
            else if (svar.equalsIgnoreCase("n")){
                for (int i = 0; i < Lodd.ledige.size() ; i++) {
                    Lodd.kjopte.put(Lodd.ledige.get(i), "Bente");
                }
                System.out.println(Lodd.kjopte);
                Lodd.ledige.clear();
                System.out.println("Hvor mange viner skal loddes ut?");
                Integer antalViner = scanner.nextInt();
                for (int i = 1; i <= antalViner ; i++) {
                    TrekkVinnere.trekkvinner();
                }
                break;
            }
        }

    }
}
