public class Game {
    public Game() {
    }

    public static String[] game(String gracz) {
        String kolorr = Cards.cardColor();
        int wartoscc = Cards.cardValue();
        String[] values = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        System.out.println(gracz + " wylosował: " + values[wartoscc] + " " + kolorr);
        String wartosc = Integer.toString(wartoscc);
        return new String[]{wartosc, kolorr};
    }
}
