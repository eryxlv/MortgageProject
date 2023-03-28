import java.util.Random;

public class Cards {
    public Cards() {
    }

    public static String cardColor() {
        String[] colors = new String[]{"Trefl", "Pik", "Karo", "Kier"};
        Random rng = new Random();
        int color = rng.nextInt(colors.length);
        return colors[color];
    }

    public static int cardValue() {
        String[] values = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        Random rng = new Random();
        int value = rng.nextInt(values.length);
        return value;
    }

    public void wynik(String color, String value) {
        System.out.println(value + " " + color);
    }
}
