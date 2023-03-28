package Tablice;

public class Tablice {
    public static void main(String[] args) {

//        double[] array = new double[]{1.29, 2.0, 3.72, 3.0, 9.34, 1.0, 2.55, 1.23894};
        external_loop:
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            internal_loop:
            for (int j = 0; j < 5; j++) {
                System.out.println("j = " + j);
                if(i == 1 && j == 2){
                    break external_loop;
                }
            }
        }




        /*double suma = 0;
        double mediana = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        mediana = suma / array.length;
        System.out.println(mediana);*/



   /*     Tablice arrayExamples = new Tablice();
        arrayExamples.arraysExample1();
    }

    private void arraysExample1(){
        String[] array = new String[10];

        int i = 0;
        while(i < 7){
            array[i] = "Hello new index: " + i;
            i++;
        }

        String completeContent = "";
        for (int k = 0; k < 7; k++){
            completeContent = completeContent + array[k] + " ";
            System.out.println("Print => " + array[k]);
        }
        System.out.println(completeContent);*/
    }
}
