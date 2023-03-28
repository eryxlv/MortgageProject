package zadaniapetlewarunki;

public class Zadania {
    public static void main(String[] args) {

        zadaniePierwsze(2020);
        zadanieDrugie(100, 300, 200);
        zadanieTrzecie(9);
        zadanieCzwarte(12);
        zadaniePiate(2);


    }

    private static void zadaniePierwsze(int rok) {
        System.out.println("Zadanie pierwsze: ");
        if (rok % 4 == 0) {
            System.out.println("Rok " + rok + " Jest rokiem przystępnym");
        } else {
            System.out.println("Rok " + rok + " Nie jest rokiem przystępnym");
        }
    }

    private static void zadanieDrugie(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("Największą liczbą jest liczba: " + a);
            }
        }
        if (b > a) {
            if (b > c) {
                System.out.println("Największą liczbą jest liczba: " + b);
            }
        }
        if (c > a) {
            if (c > b) {
                System.out.println("Największą liczbą jest liczba: " + c);
            }
        }
    }

    private static void zadanieTrzecie(int a) {
        if (a % 2 == 0) {
            System.out.println("Liczba: " + a + " jest parzysta");
        } else {
            System.out.println("Liczba: " + a + " jest nieparzysta");
        }
    }

    private static void zadanieCzwarte(int a) {
        switch (a) {
            case 1:
                System.out.println("Styczeń ma 31 dni");
                break;
            case 2:
                System.out.println("Luty ma 28 lub w przypadku roku przystępnego 29 dni");
                break;
            case 3:
                System.out.println("Marzec ma 31 dni");
                break;
            case 4:
                System.out.println("Kwiecień ma 30 dni");
                break;
            case 5:
                System.out.println("Maj ma 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec ma 30 dni");
                break;
            case 7:
                System.out.println("Lipiec ma 31 dni");
                break;
            case 8:
                System.out.println("Sierpień ma 31 dni");
                break;
            case 9:
                System.out.println("Wrzesień ma 30 dni");
                break;
            case 10:
                System.out.println("Październik ma 31 dni");
                break;
            case 11:
                System.out.println("Listopad ma 30 dni");
                break;
            case 12:
                System.out.println("Grudzień ma 31 dni");
                break;
            default:
                System.out.println("Nie ma takiego miesiąca");
        }
    }

    private static void zadaniePiate(int a) {
        int sum = 0;
        switch (a) {
            default:
                System.out.println("Nie ma takiego miesiąca");
                return;
            case 12:
                sum += 31;;
            case 11:
                sum += 30;;
            case 10:
                sum += 31;;
            case 9:
                sum += 30;;
            case 8:
                sum += 31;;
            case 7:
                sum += 30;;
            case 6:
                sum += 31;;
            case 5:
                sum += 31;;
            case 4:
                sum += 30;;
            case 3:
                sum += 31;;
            case 2:
                sum += 28;;
            case 1:
                sum += 31;
        }
        System.out.println("Miesiąc: " + a + ", minęło " + sum + " dni");

        int x = 2;
        System.out.println(x > 3 ? x < 8 ? 1 : 8 : 7);


    }




}
