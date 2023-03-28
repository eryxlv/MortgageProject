package projekt3;

public class Main {
    public static void main(String[] args){

        Czlowiek Jan = new Czlowiek("Jan");
        System.out.println(Czlowiek.liczebnosc);
        System.out.println(Jan.imie);

        Czlowiek Eryk = new Czlowiek("Eryk");
        System.out.println(Czlowiek.liczebnosc);
        System.out.println(Eryk.imie);
    }
}