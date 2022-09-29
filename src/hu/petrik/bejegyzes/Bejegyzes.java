package hu.petrik.bejegyzes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

    public void setSzerkesztve(LocalDateTime szerkesztve) {
        this.szerkesztve = szerkesztve;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
        setSzerkesztve(LocalDateTime.now());
    }

    public void like(){
        this.likeok += 1;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void setLikeok(int likeok) {
        this.likeok = likeok;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatCreated = letrejott.format(formatter);
        String formatEdited = szerkesztve.format(formatter);
        return String.format("%s - %d - " + formatCreated + "\n Szerkesztve: " + formatEdited + "\n %s", szerzo, likeok, tartalom);
        //TODO csak akkor írja a dátumot ha a bejegyzés módosítva van
    }
}
