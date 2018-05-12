package exe.arinuel;

public class arrayDemo {
    public static void main(String args[]) {
        int przykladTablicy[] = new int[10];
        int i;

        for(i = 0; i < 10; i++)
        przykladTablicy[i] = i;

        for(i = 0; i < 10; i++)
        System.out.println("element tablicy " + przykladTablicy[i]);
    }
}
