package klasy;

public class Main {
    public static void main(String[] args) {

        Zwierze kot = new Zwierze();
        System.out.println(Zwierze.liczebnosc);

        kot.imie = "Stefa";
        kot.dajGlos2(2);
        kot.przedstawSie();

        Zwierze pies = new Zwierze();
        System.out.println(Zwierze.liczebnosc);

        pies.imie = "Reksio";
        pies.dajGlos(2);
        pies.przedstawSie();
    }
}