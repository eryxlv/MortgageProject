public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String gracz1 = Players.gracz();
        String gracz2 = Players.gracz();
        String[] karta1 = Game.game(gracz1);
        String[] karta2 = Game.game(gracz2);
        int kartaa1 = Integer.parseInt(karta1[0]);
        int kartaa2 = Integer.parseInt(karta2[0]);
        if (kartaa1 > kartaa2) {
            System.out.println("Wygrał " + gracz1);
        } else if (kartaa1 < kartaa2) {
            System.out.println("Wygrał " + gracz2);
        } else {
            System.out.println("Wojna!");
            int wojnaa1 = Integer.parseInt(karta1[0]);
            int wojnaa2 = Integer.parseInt(karta2[0]);
            if (wojnaa1 > wojnaa2) {
                System.out.println("Wygrał " + gracz1);
            } else if (wojnaa1 < wojnaa2) {
                System.out.println("Wygrał " + gracz2);
            }
        }

    }
}