package xxa;

import java.util.Scanner;

public class Zwierze {


    String imie;
    String glos;


/*    public void dajGlos(int x) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jaki głos wydaje twój zwierzak?");
        String gloszwierza = scan.nextLine();
        for (int i = 0; i < x; i++) {
        }
        System.out.println();
    }
        public void przedstawSie(){
        Scanner scan = new Scanner(System.in);
            System.out.println("Jak nazywa się zwierze?");
            String imiezwierza = scan.nextLine();
        }*/

        public void end(){
        int x;
            Scanner scan = new Scanner(System.in);
            System.out.println("Jaki głos wydaje twój zwierzak?");
            String gloszwierza = scan.nextLine();
            System.out.println();

            System.out.println("Jak nazywa się zwierze?");
            String imiezwierza = scan.nextLine();

            System.out.println(imiezwierza + gloszwierza);
        }

    }

