package exe.arinuel;

class staticDemo {
    int x;
    static int y;

    int sum() {
        return x + y;
    }
}

public class sDemo {
    public static void main(String arg[]) {

        staticDemo ob1 = new staticDemo();
        staticDemo ob2 = new staticDemo();

        ob1.x = 10;
        ob2.x = 20;

        System.out.println("Oczywiście, składowe ob1.x i ob2.x są niezależne.");
        System.out.println("ob1.x: " +ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        staticDemo.y = 19;

        System.out.println(ob1.sum());
        System.out.println(ob2.sum());

    }
}
