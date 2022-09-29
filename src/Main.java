import hu.petrik.bejegyzes.Bejegyzes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Bejegyzes> bejegyzesek = new ArrayList<>();
    public static void main(String[] args) {
        Bejegyzes test = new Bejegyzes("testing1", "asdasd");
        Bejegyzes test2 = new Bejegyzes("testing2", "dsadsa");
        //System.out.println(test.toString());
        bejegyzesek.add(test);
        bejegyzesek.add(test2);
    }
}