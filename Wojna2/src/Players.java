import java.util.Scanner;

public class Players {
    public Players() {
    }

    public static String gracz() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imie gracza: ");
        String imie = scan.nextLine();
        return imie;
    }
}