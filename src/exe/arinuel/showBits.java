package exe.arinuel;


class sBits {
    int numbits;

    sBits(int n) {
        numbits = n;
    }

    void show (long val) {
        long mask = 1;

        mask <<= numbits-1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1) {
            if((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}




public class showBits {
    public static void main(String arg[]) {
        sBits li = new sBits(64);

        li.show(-89586548);
    }

}
