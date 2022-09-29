import hu.petrik.bejegyzes.Bejegyzes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.err;
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
        /*while(postNumber < 0){
            if(postNumber != -1 && postNumber < 0){
                System.out.println("Nem jó számot adott meg");
            }
            System.out.println("Adja meg hány új bejegyzést szeretne készíteni:");
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
        }*/
        int postsSum = 0;
        for (Bejegyzes bejegyzes : bejegyzesek) {
            //System.out.println(bejegyzes);
            postsSum++;
        }
        //System.out.println(postsSum);
        //System.out.println(postsSum);
        int maradek = 0;
        int likeSzam = postsSum * 20;
        double randomPost;
        int randomIndex = 0;
        for (int i = 0; i < likeSzam; i++) {
            for (int j = 0; j < bejegyzesek.size(); j++) {
                randomPost = Math.floor((Math.random()*postsSum) + 1);
                randomIndex++;
                if(randomPost == j){
                    bejegyzesek.get(j).like();
                }
            }
        }

        for (Bejegyzes bejegyzes : bejegyzesek) {
           System.out.println(bejegyzes);
        }

       /* String userText = " ";
        System.out.println("Adjon meg egy szöveget: ");
        userText = sc.nextLine();
        for (int i = 0; i < bejegyzesek.size(); i++) {
            bejegyzesek.get(1).setTartalom(userText);      ez jó kód
        }
        for (Bejegyzes bejegyzes : bejegyzesek) {
            System.out.println(bejegyzes);
        }*/

        /*int mostPopularIndex = 0;
        boolean moreThan35 = false;
        int lessThan15Number = 0;
        for (int i = 0; i < bejegyzesek.size(); i++) {
            if(bejegyzesek.get(i).getLikeok() > bejegyzesek.get(mostPopularIndex).getLikeok()){
                mostPopularIndex = i;
            }
            else if(bejegyzesek.get(i).getLikeok() > 35){
                moreThan35 = true;
            }
            else if(bejegyzesek.get(i).getLikeok() < 15){
                lessThan15Number++;
            }
        }
        for (int i = 0; i < bejegyzesek.size(); i++) {
            if(mostPopularIndex == i){
                System.out.println("A legnépszerűbb bejegyzés: " + bejegyzesek.get(mostPopularIndex));
            }
        }
        if(moreThan35){
            System.out.println("Van olyan bejegyzés ami több mint 35 likeot kapott.");
        }
        else{
            System.out.println("Nincs olyan bejegyzés ami több mint 35 likeot kapott.");
        }
        System.out.printf("Összesen %d bejegyzés kapott kevesebb mint 15 likeot.", lessThan15Number);
*/
       // Collections.sort(bejegyzesek, Collections.reverseOrder());
    }
}