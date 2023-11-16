
import java.util.Arrays;
import java.util.Random;

public class zadacha1 {
    public static void main (String[]args){
        Random random = new Random();
        int k = 2;
        int c = 4;

        int [][] arr = new int[k][c];
        for (int i = 0; i<k; i++){
            for (int j = 0; j<c;j++){
                arr [i][j] =random.nextInt(15);
            }

        }


         int temp = arr [0][0];
        for (int i = 0; i<k; i++){
            for (int j = 0; j<c;j++){
                if (temp < arr[i][j]){
                    temp = arr [i][j];

                }

                if (temp > arr [i][j]) {
                    temp = arr [i][j];
                }

            }
            System.out.println(temp);



        }


        for (int i = 0; i<k; i++){
            for (int j = 0; j<c;j++){
                System.out.print(arr [i][j]+"   ");

            }
            System.out.println();


        }


    }
}
