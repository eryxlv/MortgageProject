package Wojna;

import java.util.ArrayList;

public class Players {
    private ArrayList<Karta> karty;
    private String nazwa;

    this.nazwa = nazwa;
    karty = new ArrayList<Karta>();

    public Players(String nazwa) {
        this.nazwa = nazwa;
        karty = new ArrayList<Karta>();
    }

    public String getNazwa() {
        return nazwa;
    }

    public void dodajKarte(Karta karta) {
        karty.add(karta);
    }

    public Karta dajKarte() {
        if (karty.size() > 0) {
            return karty.remove(0);
        } else {
            return null;
        }
    }

    public int liczbaKart() {
        return karty.size();
    }
}


