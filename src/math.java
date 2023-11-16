import java.util.Random;

public class math {
    public static void main (String[]args){
        double e = Math.E;
        double pi = Math.PI;

        System.out.println(Math. random()*10);
        Random  random  = new Random();
       // int i =  random.nextInt((int)Math.floor(Math. random()*10));

        int[] ints = new  int[32];
        ints [0] = 1;
        ints [2] = 12;
        ints [1] = 14;
        ints [4] = 15;


        int[] s = {1,3,56,7};
        int n= random.nextInt(10, 20);
        int [] ints1 = new int[n];

        int count = 10;
        int []  arr = new int[10];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i< arr.length; i++) {

            System.out.println(arr[i]);
        }


            for (int temp: arr){
                System.out.println(temp);
            }


        }

}
