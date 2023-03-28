import java.util.Scanner;

public class Lekcja11 {
    /*public static void main(String[] args){
        int x = 1;
        increment(x);
        System.out.println(x);
    }
    public static void increment(int x){
        x++;
        System.out.println(x);
    }*/

   /* public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1 = 1; // pierwszy numer
        int number2 = 1; // drugi numer
        int largerNum = 1; // najwiekszy numer

        System.out.println("Wpisz numer od 1 do 100: ");
        number1 = input.nextInt(); // wpisywanie 1 numeru
        System.out.println("Wpisz drugi numer od 1 do 100: ");
        number2 = input.nextInt(); // wpisywanie 2 numeru

        largerNum = numberCompare(number1, number2); // metoda porówanania
        System.out.println("Wiekszą liczbą jest cyfra: " + largerNum);

    }

    private static int numberCompare(int num1, int num2) {
        if(num1 > num2) return num1;
        else return num2;
    }*/

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double number1 = 1.0, number2 = 1.0, number3 = 1.0;
        double sum = 1.0;

        System.out.println("Wpisz liczbe od 0 do 100: ");
        number1 = input.nextDouble();
        System.out.println("Wpisz drugą liczbe od 0 do 100: ");
        number2 = input.nextDouble();
        System.out.println("Wpisz trzecią liczbe od 0 do 100: ");
        number3 = input.nextDouble();

        sum = sumCompare(number1, number2, number3);
        System.out.println("Średnia arytmetyczna tych liczb wynosi: " + sum);
    }

    private static double sumCompare(double a, double b, double c) {
        double sum = (a+b+c)/3.0;
                return sum;
    }

}
