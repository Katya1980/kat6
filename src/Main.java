import java.util.Scanner;

public class Main {
    public static void main(String[] ags) {

        Box box = new Box();

        Box box2 = new Box();

        Box box1 = new Box();


        System.out.println(box.a + " from Box");
        System.out.println(box.a + " from Box");

        box.name = "test";
        box1.name = "test";

        System.out.println(box.name + "  name from Box");
        System.out.println(box.name + "  name from Box");


        if (box1.name == box.name){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        Box box3 = new Box(10, "test1");
        System.out.println(box3.name);


        int  v = box3.test2();

        System.out.println(v + "  Hello");


        Calculator calculator = new Calculator(" red",10,20) ;
        calculator.del(43,7);
        calculator.minus(36,6);
        calculator.umn(2,3);
        calculator.add(3,6);

        System.out.println(calculator);

        int fact = calculator.fact(5);
        System.out.println(fact);



    }



}
