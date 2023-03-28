package StringFormat;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        long b = 3;
        String c = "String";

        String someValue = "some value is: " + a + " another value is: " + b + " and again value is: " + c;
        String anotherValue = String.format("some value is: %s another value is: %s and again value is: %s ", a, b, c);
        System.out.println("Some value " + someValue);
        System.out.println("Another value: " + anotherValue);

        System.out.printf("printf " + "some value is: %s another value is: %s and again value is: %s", a, b, c);

    }
}