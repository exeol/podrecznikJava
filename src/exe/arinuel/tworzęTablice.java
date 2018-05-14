package exe.arinuel;

class teczka {
    int tab[][];
    int x, y;

    teczka(int x, int y) {
        tab = new int[x][y];
    }

    void napelniacz(int k) {
        for(x = 0; x < tab.length; x++) {
            for(y = 0; y < tab[0].length; y++) {
                tab[x][y] = k;
                k++;
            }
        }
    }

    int oddawacz(int p, int r) {
        return tab[p][r];
    }
}




public class tworzęTablice {
    public static void main(String arg[]) {
        teczka bryla = new teczka(14, 22);

        bryla.napelniacz(4);

        int o = bryla.oddawacz(4, 4);

        System.out.println(o);


    }
}