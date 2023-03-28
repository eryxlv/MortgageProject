package zmiennezadania;

public class Main {
    public static void main(String[] args) {
        {
            // Zadanie 1
            String a = "Eryk";
            int size = a.length();
            System.out.println(size);
        }

        {
            // Zadanie 2
            String a = "Eryk";
            String b = "Fryderyk";
            String c = "Gasior";
            String d = "Alan";
            String e = "Bartosz";

            System.out.printf("%s%s%s%s%s", a, b, c, d, e);
            System.out.println();
            System.out.println(a.concat(b).concat(c).concat(d).concat(e));
        }

        {
            // Zadanie 3
            String a = "Czesc nazywam sie Eryk";
            String liczba = "2.1";
            System.out.println("Oryginalne: " + a);
            System.out.println("Zmienione: " + a.replace("a", liczba).replace("e", liczba).replace("i", liczba).replace("o", liczba).replace("u", liczba).replace("y", liczba));
        }

        {
            // Zadanie 4
            String przyklad = "Ucze sie jezyka Java";
            System.out.println("Czy zdanie zawiera słowo Java?: " + przyklad.contains("Java"));
        }

        {
            String a = "Java";
            String b = "jaVa";
            boolean c = a.equalsIgnoreCase(b);
            System.out.println(c);
        }

        {
            // Zadanie 6
            String przyklad = "SomeStringLongerThan10Signs";
            System.out.println(przyklad.substring(3, 8));
        }



    }
}
