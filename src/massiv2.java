import java.util.Arrays;
import java.util.Random;

public class massiv2 {
    public static void main (String[]args){
        int[]ints = new int[3];
        int[]ints1 = new int[3];
        int [] ints21 = new int[13];

        int [][] arr = new int[][] {ints, ints1, ints21};

        arr [0] = ints;
        arr [1] = ints1;





        for (int i: ints){
            //System.out.println(i);

        }


        int k = 2;
        int c = 3;
        int[] [] ints2 = new int [k][c];
        int[] [] ints4 = new int [][]{{0,10,1},{0,3,4}};



        for (int i = 0; i< k; i++) {
            for (int j = 0; j < c; j++) {
              ints2[i][j] = new Random().nextInt(10);
            }
        }



        for (int i = 0; i < ints2.length; i++){
            for (int j = 0; j < ints2[i].length; j++) {
                System.out.print(ints2[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println(Arrays.equals(ints, ints1));



        int[][]testArr = new int[6][6];
        for (int i = 0; i< testArr.length; i++) {
            for (int j = 0; j < testArr.length; j++) {
                System.out.println();
            }
        }




    }
}
