package exe.arinuel;

public class showBits {
    public static void main(String arg[]) {
        int t;
        byte val;

        val = 32;

        for(t = 128; t > 0; t = t/2)
            if((val & t) != 0) System.out.print("1 ");
        else System.out.print("0 ");
    }
}
