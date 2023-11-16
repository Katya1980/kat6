public class Box {

    int a = 10;
    int b = 10;
    String name;

    public Box() {

    }

    public Box(int a, String name) {

        this.name = name;
        if (a >= 0) {
            this.a = a;
        }

    }

    public Box(int a, String name, int b) {
        this(a, name);
        this.b = b;


        this.test(10);

    }

    public void test(int a1, String name) {
        System.out.println("nothing");
        this.a = a;
        this.name = name;

    }
    public void test(int a1) {
        System.out.println("nothing");
        this.a = a;
        this.name = name;

    }

    public int test2(){
        ///
        ///
          return  10;

    }


}
