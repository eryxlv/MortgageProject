import java.math.BigInteger;
import java.util.Scanner;

public class Lekcja1 {
    public static void main(String[] args){
        // Znak - jedna litera
        char firstLetter = 'E';
        System.out.println("First letter of your name is: " + firstLetter);

        // String - słowo
        String zString = "Eryk";
        System.out.println("Your name is: " + zString);

        // Boolean - true or false
        boolean zBoolean = true;
        System.out.println("Boolean is: " + zBoolean);

        // Byte - 255 liczb
        byte zByte = Byte.MIN_VALUE;
        byte zByte2 = Byte.MAX_VALUE;
        System.out.println("Byte: " + zByte + " and " + zByte2);

        // Short - srednie liczby
        short zShort = Short.MIN_VALUE;
        short zShort2 = Short.MAX_VALUE;
        System.out.println("Short: " + zShort + " and " + zShort2);

        // int - duze liczby(najpopularniejsze)
        int zInt = Integer.MIN_VALUE;
        int zInt2 = Integer.MAX_VALUE;
        System.out.println("Integer: " + zInt + " and " + zInt2);

        // long - bardzo duze liczby
        long zLong = Long.MIN_VALUE;
        long zLong2 = Long.MAX_VALUE;
        System.out.println("Long: " + zLong + " and " + zLong2);

        //  float - liczby po przecinku
        float zFloat = 3.1474264f;
        float zFloat2 = Float.MIN_VALUE;
        float zFloat3 = Float.MAX_VALUE;
        System.out.println("Float: " + zFloat + " and min: " + zFloat2 + " and max: " + zFloat3);

        //double - jeszcze wieksze po przecinku
        double zDouble = Double.MIN_VALUE;
        double zDouble2 = Double.MAX_VALUE;
        System.out.println("Double: " + zDouble + " and " + zDouble2);

        //coś stałe = final
        final int liczba = 256;
        System.out.println(liczba);
    }
}
