package exe.arinuel;

class staticBlock {
    static double root0f2;
    static double root0f3;

    static {
        System.out.println("wewnątrz static");
        root0f2 = Math.sqrt(2.0);
        root0f3 = Math.sqrt(3.0);

    }

    staticBlock(String msg) {
        System.out.println(msg);
    }
}

public class sDemo2 {
    public static void main(String arg[]) {

        staticBlock obj = new staticBlock("Wewnątrz konstruktora");

        System.out.println(staticBlock.root0f2);
        System.out.println(staticBlock.root0f3);

    }
}
