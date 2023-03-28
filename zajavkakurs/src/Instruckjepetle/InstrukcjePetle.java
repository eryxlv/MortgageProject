package Instruckjepetle;

public class InstrukcjePetle {
    public static void main(String[] args) {
        first_loop:
        for (int i = 0; i < 4; i++) {
            System.out.println("First loop: i = " + i);
            second_loop:
            for (int j = 0; j < 4; j++) {
                System.out.println("Second loop: i = " + i + ", j = " + j);
                third_loop:
                for (int k = 0; k < 4; k++) {
                    if (j == 2) {
                        System.out.println("continue j == 2");
                        continue;
                    }
                    if (k == 1) {
                        System.out.println("continue k == 1");
                        break second_loop;
                    }
                    System.out.println("Third loop: i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }

    }
}








        /*  int i = 1;
        int j = 10;
        while (i <= 10 && j >= 1) {
            System.out.println("Hello World!");
            i++;
            j--;
        }*/

      /*  for(int i = 1; method(i); i++){
            System.out.println("i = " + i);
        }

    }

    private static boolean method(int i) {
        System.out.println("Checking i: " + i);
        return i < 4;
    }*/


       /* for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("both i and j. i = " + i + ", j = " + j);
                for (int k = 0; k < 10; k++) {
                    System.out.println("all i, j, k.  i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }*/

