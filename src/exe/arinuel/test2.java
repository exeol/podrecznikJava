package exe.arinuel;


public class test2 {
    public static void main(String arg[]) {
        int tab[] = new int[22];

        for(int i = 0; i < tab.length; i++)
            tab[i] = i*i;


        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}