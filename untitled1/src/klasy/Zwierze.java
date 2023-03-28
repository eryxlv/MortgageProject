package klasy;

public class Zwierze {
    static int liczebnosc = 0;
            Zwierze(){
        liczebnosc++;
            }
    String imie;
    String glos = "Grrrr";
    String glos2 = "Meeow";
    public void dajGlos(int x){
        for(int i = 0; i < x; i++){
            System.out.print(glos + " ");
        }
        System.out.println();
    }

    public void dajGlos2(int x){
        for(int i = 0; i < x; i++){
            System.out.print(glos2 + " ");
        }
        System.out.println();
    }
    public void przedstawSie(){
        System.out.println("Nazywam się " + imie);
    }
}
