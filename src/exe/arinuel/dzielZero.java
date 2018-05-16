package exe.arinuel;

public class dzielZero {
    public static void main(String arg[]) {

        for(int i = -5; i < 5;i++) {
            if(i!=0 ? true : false) {
                int n = 100/i;
                System.out.println("Wynik dzielenia 100 / " +i +" wynosi: " +n);
            }
        }
    }
}
