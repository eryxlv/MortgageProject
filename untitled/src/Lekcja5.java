public class Lekcja5 {
    public static void main(String[] args){
        int poraRoku = 5;

        switch (poraRoku){
            case 1:
                System.out.println("Wiosna");
                break;
            case 2:
                System.out.println("Lato");
                break;
            case 3:
                System.out.println("Jesień");
                break;
            case 4:
                System.out.println("Zima");
                break;
                // default - jeśli żaden numer case nie został wybrany co ma wyświetlić
            default:
                System.out.println("Nic");

        }
    }
}
