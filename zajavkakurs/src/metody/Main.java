package metody;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.someMethod(1, "eryk");

        main.someMethod(2, "bartosz");

        main.someMethod(3, "karyna");

        main.someMethod(4, "fryderyk");

        main.someMethod(5, "alan");
        System.out.println();
        przykald();




    }

     void someMethod(int a, String b){
        System.out.println(b);
        System.out.println(a);
    }

    private static void przykald(){
        var userNumber = 900; // Jeśli obie są true to drukuje "Impreza duża" Jeśli jedno "Impreza mała" jeśli nic "Impreza nie odbedzie"
        String feedback = (userNumber > 100) ? (userNumber > 1000) ? "Impreza duża!" : "Impreza mała" : "Impreza sie nie odbedzie";
        System.out.println(feedback);
    }
}
