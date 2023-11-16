import java.util.Scanner;
public class scan {
    public static void main (String[]args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        int b=0;
        if (a<=0){
            System.out.println("Не верно!");
            }
         else {
             for (int i=1; i<=a; i++){
                 b+=i;
             }
        }
        System.out.println(b);


        }



}
