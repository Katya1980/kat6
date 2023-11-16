public class Calculator {

    String color;
    int w;
    int coast;
    {
        color = " red";
        w = 10;
        coast = 20;
    }

    public Calculator(String color, int w, int coast) {
        this.color = color;
        this.w = w;
        this.coast = coast;

    }

    public void add(int a, int b) {
        System.out.println("a+ b = " + (a + b));
    }

    public void minus(int a, int b) {
        System.out.println("a - b = " + (a - b));
    }

    public void umn(int a, int b) {
        System.out.println("a * b = " + (a * b));
    }

    public void del(int a, int b) {
        System.out.println("a / b = " + (a / b));
    }

    public  int fact(int n) {

        if (n == 1) {
            System.out.println();
            return 1;
        }
        return n * fact(--n);

    }




}