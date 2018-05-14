package exe.arinuel;

public class forEach {
    public static void main(String arg[]) {
        int table[] = {2, 5, 7, 9, 3, 14, 21, 18, 2, 0, -3};
        int x = 0;
                for(int y : table) {
            System.out.println(y);
            x += y;
                }
                System.out.print("\n \n" + x);
    }
}