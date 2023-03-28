public class Lekcja2 {
    public static void main(String[] args) {
        // zeby wyniki wyswietlały po przecinku musi być float albo double w wyniku
        int a = 25;
        int b = 10;
        float wynik = (float) a / b;
        System.out.println(wynik);

        // % pokazuje reszte z dzielenia
        int c = 20;
        int d = 1;
        float wynik2 =  c % d;
        System.out.println(wynik2);

        // w nawiasach pierwszenstwo matematyka
        int e = 20;
        int f = 5;
        float wynik3 = (2 + 2) * 2;
        System.out.println(wynik3);

        // skrocony zapis
        int g = 20;
        int h = 5;
        g += h;
        // g -= h
        // g *= h
        // g /= h
        // g %= h
        System.out.println(g);

        //potegowanie, pierwiastkowanie
        Math.pow(2, 3);
        System.out.println(Math.pow(2, 5));
        Math.sqrt(9);
        System.out.println(Math.sqrt(9));

        // inkrementacja, dekrementacja - zwiekszenie liczby zawsze o 1, zmniejszenie liczby zawsze o 1
        int x = 20;
        int z = 10;
        x++;
        z--;
        System.out.println(x);
        System.out.println(z);
        // jesli chcemy od razu w princie to ++a, nie a++
        System.out.println(++x);
    }
}
