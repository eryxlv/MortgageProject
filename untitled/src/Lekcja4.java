public class Lekcja4 {
    public static void main(String[] args) {
        int wiek = 18;
        if (wiek >= 18) {
            System.out.println("Pełnoletnia");
        } else if(wiek >= 16) {
            System.out.println("Możesz pracować");
        } else {
                System.out.println("Nie możesz nic");
            }
            // ? - jeśli zapytanie to prawda wtedy zwróci tą wartość
            // : - jesli zapytanie to fałsz wtedy zwróci tą wartość
            String imie = wiek >= 18 ? "Eryk" : "Eryś";
                    System.out.println(imie);
    }
}