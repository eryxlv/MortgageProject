package PetleZadania;

public class Petle {
    public static void main(String[] args) {
        zadaniePierwsze(5);
        System.out.println();
        zadanieDrugie("kajar");
        System.out.println();
        zadanieTrzecie('#', 7);
        System.out.println();
        zadaniePiate();
        System.out.println();
        zadanieSiodme(18);
        System.out.println();
        zadanieOsme();
    }

    private static void zadanieOsme() {
        int number = 0;
        for (int i = 0; i < 9; i++) {
            number += 111;
            System.out.println(number);
            for (int j = 0; j < 4; j++) {
                System.out.println("####");
            }
        }
    }

    private static void zadanieSiodme(int dlugosc) {
        int a = 0;
        int b = 1;
        System.out.println(a + " ");
        System.out.println(b + " ");

        for (int i = 1; i < dlugosc; i++) {
            int c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }

    private static void zadaniePiate() {
        for (int i = 0; i <= 10; i++) {
            boolean first = true;
            if(i < 2){
                first = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if(i % j == 0){
                        first = false;
                        break;
                    }
                }
            }
            if(first){
                System.out.println(i);
            }
        }
    }


    static void zadanieTrzecie(char znak, int znakiNaDole) {

        int znakiNaGorze = znakiNaDole % 2 == 0 ? 2 : 1;
        int height = 0;
        for (int i = znakiNaDole; i > 0; i -= 2) {
            height++;
        }
        int iloscZnakowWiersza = znakiNaGorze;

        for (int row = 0; row < height; row++) {
            int iloscSpacji = (znakiNaDole - iloscZnakowWiersza) / 2;
            for (int column = 0; column < znakiNaDole - iloscSpacji; column++) {
                System.out.print(column < iloscSpacji ? " " : znak);
            }
            iloscZnakowWiersza += 2;
            System.out.println();
        }
        System.out.println();

    }

    static void zadaniePierwsze(int a) {
        int suma = 1;
        for (int i = 1; i < a + 1; i++) {
            suma *= i;
        }
        System.out.println("Silnia z " + a + " Wynosi " + suma);
    }

    static void zadanieDrugie(String a) {
        for (int i = 0; i < a.length() / 2; i++) {
            if(a.charAt(i) != a.charAt(a.length() - i - 1)){
                System.out.println("Nie jest to Palindrom");
            } else{
                System.out.println("Słowo " + a + " Jest palindromem");
            }
        }

    }
}
