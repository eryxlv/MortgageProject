public class Lekcja10 {
    public static void main(String[] args) {
        String h = wyswietl();
        System.out.println(h);
        System.out.println(dodaj(5));
        System.out.println(dodaj(5, 6));
    }
    static String wyswietl(){
        return "Hello World!";
    }

    static int dodaj(int x){
        return ++x;
    }
    static int dodaj(int x, int y){
        return x + y;
    }



}
