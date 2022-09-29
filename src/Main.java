import hu.petrik.bejegyzes.Bejegyzes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    static List<Bejegyzes> bejegyzesek = new ArrayList<>();
    public static void main(String[] args) {

        File file = new File("bejegyzesek.csv");
        Scanner scR;
        try {
            scR = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scR.hasNextLine()) {
            String[] split = scR.nextLine().split(";");
            bejegyzesek.add(new Bejegyzes(split[0], (split[1])));
        }
        /*for (int i = 0; i < bejegyzesek.size(); i++) {
            System.out.println(bejegyzesek.get(i));    //test
        }*/

        Bejegyzes test = new Bejegyzes("testing1", "asdasd");
        Bejegyzes test2 = new Bejegyzes("testing2", "dsadsa");
        //System.out.println(test.toString());
        bejegyzesek.add(test);
        bejegyzesek.add(test2);

        int postNumber = -1; //-1 hogy belépjen a whileba
        Scanner sc = new Scanner(in);
        while(postNumber < 0){
            if(postNumber != -1 && postNumber < 0){
                System.out.println("Nem jó számot adott meg");
            }
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