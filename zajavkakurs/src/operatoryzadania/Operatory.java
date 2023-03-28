package operatoryzadania;

public class Operatory {
    public static void main(String[] args) {
        zadaniePierwsze(2.5, 10.0);
        System.out.println();
        zadanieDrugie();
        System.out.println();
        zadanieTrzecie();
        System.out.println();
        zadanieCzwarte();
        System.out.println();
        zadaniePiate(21);
    }

    static void zadaniePierwsze(double a, double b){
        System.out.println("Zadanie 1: ");
       double sum = a + b;
       double diff = a - b;
       double mnozenie = a * b;
       double dzielenie = a / b;
        System.out.println("Wynik dodawania: " + sum + "\n" + "Wynik dzielenia: " + diff + "\n" + "Wynik mnożenia: "
        + mnozenie + "\n" + "Wynik dzielenia: " + dzielenie);
    }

    static void zadanieDrugie(){
        System.out.println("Zadanie 2: ");
        int x = 0;
        System.out.println("Operator ==  : " + (x == 5));
        System.out.println("Operator ! : " + !(x == 5));
        System.out.println("Operator !=  : " + (x != 1));
        System.out.println("Operator ++  : " + ++x);
        System.out.println("Operator -=  : " + (x -= 3));
        System.out.println("Operator *= : " + (x *= 3));

    }
    static void zadanieTrzecie(){
        System.out.println("Zadanie 3: ");

        byte x = 0;

        int a = 150;
        int xa = (byte)(x + a);
        System.out.println(xa);

        long b = 350;
        long xb = (byte)(x + b);
        System.out.println(xb);

        float c = 17.3F;
        float xc = (byte)(x + c);
        System.out.println(xc);

        double d = 2.7;
        double xd = (byte)(x + d);
        System.out.println(xd);

        float e = x + 4.2f;
        System.out.println(e);
    }

    static void zadanieCzwarte(){
        System.out.println("Zadanie 4: ");
        int ilosc = 100;
        int colors = 6;
        int red = 0, green = 1, blue = 2, black = 3, yellow = 4, brown = 5;
        int wynik = ilosc % colors;
        System.out.println(wynik);


    }

    static void zadaniePiate(int a){
        System.out.println("Zadanie 5: ");
        System.out.println("Twoja liczba to: " + a);
        if(a % 3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }

        if(a % 7 == 0){
            System.out.println("Liczba jest podzielna przez 7");
        } else{
            System.out.println("Liczba nie jest podzielna przez 7");
        }

        if(a % 3 == 0 && a % 7 == 0){
            System.out.println("Liczba jest podzielna przez 3 i 7 jednocześnie");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3 i 7 jednocześnie");
        }

    /*    Tu jeśli jest podzielna przez 3 i 7 wydrukuje tylko to, jeśli jest przez 3 wydrukuje ze
          tylko przez 3 jesli przez 7 wydrukuje ze tylko przez 7, nie wszystko na raz

      if(a % 3 == 0 && a % 7 == 0){
            System.out.println("Liczba jest podzielna przez 3 i 7 jednocześnie");
        } else if(a % 3 != 0 && a % 7 != 0){
            System.out.println("Liczba nie jest podzielna przez 3 i 7 jednocześnie");
        } else if(a % 3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        } else if(a % 3 != 0){
            System.out.println("Liczba nie jest podzielna przez 3");
        } else if(a % 7 == 0){
            System.out.println("Liczba jest podzielna przez 7");
        } else{
            System.out.println("Liczba nie jest podzielna przez 7");
        }
        */


    }
}
