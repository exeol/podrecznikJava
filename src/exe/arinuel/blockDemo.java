package exe.arinuel;



class block {
    int a;
    int b;
    int c;
    int volume;

    block(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
        volume = x*y*z;
    }

    boolean sprawdzam(block ob) {
        if(ob.a == a & ob.b ==b & ob.c ==c )
            return true;
        else return false;
    }

    boolean sprawdzam2(block ob) {
        if(ob.volume == volume) return true;
        else return false;
    }

}


public class blockDemo {
    public static void main(String arg[]) {

        block bryla1 = new block(10, 20, 30);
        block bryla2 = new block(10, 20, 30);
        block bryla3 = new block(30, 20, 10);

        if(bryla1.sprawdzam(bryla2))
            System.out.println("bryła 1 i bryła 2 mają takie same wymiary");
        else System.out.println("bryły 1 i 2 mają różne wymiary");

        if(bryla1.sprawdzam2(bryla3))
            System.out.println("bryły 1 i 3 mają tę samą objętość");
        else System.out.println("bryły 1 i 3 mają rózną objętość");

    }
}
