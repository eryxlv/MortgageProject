package Wojna;

public class Gra {

    private Cards talia;
    private Players gracz1;
    private Players gracz2;

    public Gra() {
        talia = new Cards();
        gracz1 = new Players("Gracz 1");
        gracz2 = new Players("Gracz 2");
        rozdajKarty();
    }

    private void rozdajKarty() {
        for (int i = 0; i < 26; i++) {
            gracz1.dodajKarte(talia.giveCard());
            gracz2.dodajKarte(talia.giveCard());
        }
    }

    public void rozgrywka() {
        while (gracz1.liczbaKart() > 0 && gracz2.liczbaKart() > 0) {
            Karta karta1 = gracz1.dajKarte();
            Karta karta2 = gracz2.dajKarte();
            System.out.println(gracz1.getNazwa() + ": " + karta1);
            System.out.println(gracz2.getNazwa() + ": " + karta2);
            if (karta1.getWartosc() > karta2.getWartosc()) {
                gracz1.dodajKarte(karta1);
                gracz1.dodajKarte(karta2);
                System.out.println(gracz1.getNazwa() + " wygrywa rundę");
            } else if (karta2.getWartosc() > karta1.getWartosc()) {
                gracz2.dodajKarte(karta1);
                gracz2.dodajKarte(karta2);
                System.out.println(gracz2.getNazwa() + " wygrywa rundę");
            } else {
                System.out.println("Remis");
            }
        }
        if (gracz1.liczbaKart() > 0) {
            System.out.println(gracz1.getNazwa() + " wygrywa grę!");
        } else if (gracz2.liczbaKart() > 0) {
            System.out.println(gracz2.getNazwa() + " wygrywa grę!");
        } else {
            System.out.println("Gra zakończyła się remisem!");
        }
    }


}
