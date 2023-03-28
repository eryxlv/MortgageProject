package TabliceWielowymiarowe;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tabliceww {
    public static void main(String[] args) {
        int[][] dim2 =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

        System.out.println("Main diagonal sum = " + getMainDiagSum(dim2));
        System.out.println("Second diagonal sum = " + getSecondDiagSum(dim2));
    }

    private static int getSecondDiagSum(int[][] array) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(row == array[row].length - 1 - col){
                    sum += array[row][col];
                }
            }
        }
        return sum;
    }

    private static int getMainDiagSum(int[][] array) {
            int rowsSize = array.length;
            for (int[] row : array) {
                int colsSize = row.length;
                if(colsSize != rowsSize){
                    return -1;
                }
            }
            int sum = 0;
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    if(row == col){
                        sum += array[row][col];
                    }
                }
            }
            return sum;
        }


        /*for (int[] ints : dim2) {
            System.out.println(Arrays.toString(ints));
        }
        String[][] array = new String[3][];
        String[][] array2 = {null, null, null};
        String[] array3 = {null, null, null};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println();

        for (String[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("---");
        for (String[] ints : array2) {
            System.out.println(Arrays.toString(ints));
        }*/

}
