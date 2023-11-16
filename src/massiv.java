import java.util.Random;

public class massiv {
    public static void main (String[]args) {
        Random random = new Random();
        int count = 10;
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 100);
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        int min = Integer.MAX_VALUE;
        for (int temp : arr) {
            if (min > temp) {
                min = temp;
            }
        }
        System.out.println();
        System.out.println(min);


        int[] test = new int[5];

        for (int i = 0; i < test.length; i++) {
            test[i] = random.nextInt(10);
        }


        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] *  test[i]+"    ");


        }

    }

}
