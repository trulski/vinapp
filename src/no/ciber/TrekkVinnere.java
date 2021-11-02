package no.ciber;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrekkVinnere {

    public static void trekkvinner(){
        List<Integer> keysArray = new ArrayList<Integer>(Lodd.kjopte.keySet());
        Random random = new Random();
        String vinner = Lodd.kjopte.get(random.nextInt(Lodd.kjopte.size()));
        System.out.println("Vinneren er ........... " + vinner);
    }



}
