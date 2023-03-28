package OperatoryLogiczne;

public class Logiczne {
    public static void main(String[] args) {
        {

            // Koniunkcja (Oba muszą być true)
            System.out.println("Koniunkcja: ");
            System.out.println("true && true = " + (true && true));
            System.out.println("true && false = " + (true && false));
            System.out.println("false && true = " + (false && true));
            System.out.println("false && false = " + (false && false));
        }
        System.out.println();
        {
            // Alternatywa (Przynajmniej jeden musi być true)
            System.out.println("Alternatywa: ");
            System.out.println("true || true = " + (true || true));
            System.out.println("true || false = " + (true || false));
            System.out.println("false || true = " + (false || true));
            System.out.println("false || false = " + (false || false));
        }
        System.out.println();
        {
            // Równoważność
            System.out.println("Równoważność: ");
            System.out.println("true == true = " + (true == true));
            System.out.println("true == false = " + (true == false));
            System.out.println("false == true = " + (false == true));
            System.out.println("false == false = " + (false == false));
        }
        System.out.println();
        {
            // Alternatywa rozłączna (Wtedy kiedy są różne)
            System.out.println("Alternatywa rozłączna: ");
            System.out.println("true != true = " + (true != true));
            System.out.println("true != false = " + (true != false));
            System.out.println("false != true = " + (false != true));
            System.out.println("false != false = " + (false != false));
            System.out.println("Zamiast != Można zapisać ^");
        }
        // Short Circuit - W przypadku Koniunkcji jeśli pierwsze wyrażenie jest false nie sprawdza drugiego
        // bo nie ma to sensu przez co zaoszczędzamy czas, a w Alternatywie jeśli pierwsze jest true nie sprawdza drugiego
    }
}
