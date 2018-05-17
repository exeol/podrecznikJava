package exe.arinuel;

class overload {

    void ovlDemo() {
        System.out.println("bez parametrów");
    }

    void ovlDemo(int a){
        System.out.println("Jeden parametr: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Dwa parametry: " + a + " " +b );
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Dwa parametry typu double: " + a + " " +b);
        return a + b;
    }
}

public class overloadDemo {
    public static void main(String arg[]) {
        overload ob = new overload();
        int resI;
        double resD;


        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Wynik wywołania ob.ovlDemo(4, 6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.34);
        System.out.println("Wynik wywołania ob.ovlDemo(1.1, 2.34): " + resD);
    }
}
