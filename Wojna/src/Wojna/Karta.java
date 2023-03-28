package Wojna;

public class Karta {
    private String kolor;
    private int wartosc;

    public Karta(String kolor, int wartosc){
        this.kolor = kolor;
        this.wartosc = wartosc;
    }

    public String getKolor(){
        return kolor;
    }

    public void setKolor(String kolor){
        this.kolor = kolor;
    }

    public int getWartosc(){
        return wartosc;
    }

    public void setWartosc(int wartosc){
        this.wartosc = wartosc;
    }
}
