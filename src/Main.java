import hu.petrik.bejegyzes.Bejegyzes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    static List<Bejegyzes> bejegyzesek = new ArrayList<>();
    public static void main(String[] args) {
        Bejegyzes test = new Bejegyzes("testing1", "asdasd");
        Bejegyzes test2 = new Bejegyzes("testing2", "dsadsa");
        //System.out.println(test.toString());
        bejegyzesek.add(test);
        bejegyzesek.add(test2);

        int postNumber = -1; //-1 hogy belépjen a whileba
        Scanner sc = new Scanner(in);
        while(postNumber < 0){
            System.out.println("Adja meg hány új bejegyzést szeretne készíteni");
            postNumber = Integer.parseInt(sc.nextLine());
        }
        int addedPosts = 0;
        String newSzerzo;
        String newTartalom;
        while(postNumber != addedPosts){
            addedPosts++;
            System.out.println("Adja meg a bejegyzés szerzőjét: ");
            newSzerzo = sc.nextLine();
            System.out.println("Adja meg a bejegyzés tartalmát: ");
            newTartalom = sc.nextLine();
            Bejegyzes userPost = new Bejegyzes(newSzerzo, newTartalom);
            bejegyzesek.add(userPost);
        }
        for (Bejegyzes bejegyzes : bejegyzesek) {
            System.out.println(bejegyzes);
        }
    }
}