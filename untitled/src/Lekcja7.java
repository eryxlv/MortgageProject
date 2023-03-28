import java.util.Random;
import java.util.Scanner;

public class Lekcja7 {
    public static void main(String[] args){
        int i = 0;
        int los;
        int odp;

        Random rng = new Random();
        los = (rng.nextInt(5 ) +1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbe od 1 do 5");
        do{
            i++;
            System.out.println("Podaj liczbe: ");
            odp = scanner.nextInt();
            if(odp > los){
                System.out.println("Niestety nie zgadłeś, liczba jest mniejsza");
            } else if(odp < los){
                System.out.println("Niestety nie zgadłeś, liczba jest wieksza");
            }

        } while(odp != los);
        System.out.println("Odgadłeś liczbe za " + i + " razem");
    }
}
