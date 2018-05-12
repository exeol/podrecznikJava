package exe.arinuel;

public class dualArray {
    public static void main(String args[]){
        int i, x, y;
        int tablica[][] = new int[3][4];

        i = 1;
        for(x=0; x<3; x++)
            for(y=0; y<4; y++) {
            tablica[x][y] = i;
            i +=1;
            }


        i = 1;
        for(x=0; x<3; x++)
            for(y=0; y<4; y++) {
                System.out.println("element x=" +x +" y=" +y +" = " + tablica[x][y]);
            }
    }
}
