package exe.arinuel;

public class miniMax {
    public static void main(String args[]) {
        int łańcuch[] = {30, -6, 21, 18, -2, 48, 46, -45};
        int min, max;

        min = max = łańcuch[0];
        for(int i = 0; i<8; i++) {
            if(min>łańcuch[i])
                min = łańcuch[i];
            if(max<łańcuch[i])
                max = łańcuch[i];

        }
        System.out.println("min i max to: " + min + " " + max);
    }
}
