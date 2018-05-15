package exe.arinuel;

public class forEach {
    public static void main(String arg[]) {
        int table[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for(int x[] : table) {
            for(int y : x) {
                System.out.println(y);
            }
        }
        System.out.println(arg.length);


    }
}