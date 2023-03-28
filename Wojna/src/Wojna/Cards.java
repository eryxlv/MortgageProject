package Wojna;

import java.util.ArrayList;
import java.util.Collections;

public class Cards {
    private ArrayList<Karta> karty;
    public int Talia(){
        karty = new ArrayList<Karta>();
        String[] kolory = {"Trefl", "Karo", "Kier", "Pik"};
        for (int i = 2; i <= 14; i++){
            for (String kolor : kolory){
                karty.add(new Karta(kolor, i));
            }
        }
        Shuffle();
        return 0;
    }

    public void Shuffle(){
        Collections.shuffle(karty);
    }

    public Karta giveCard(){
        if(karty.size() > 0) {
            return karty.remove(0);
        } else {
            return null;
        }
    }

    public int liczbaKart(){
        return karty.size();
    }

}
