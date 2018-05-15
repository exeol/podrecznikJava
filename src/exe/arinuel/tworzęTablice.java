package exe.arinuel;

class wzór {
    int tt[][];
    int k, l;

    wzór(int x, int y) {
        tt = new int[x][y];

    }

    void napełniacz(int i) {
        for(k=0; k<tt.length; k++) {
            for (l = 0; l < tt[0].length; l++) {
                tt[k][l] = i;
                i++;
            }
        }
    }


    int podawacz(int u, int p) {
        return tt[u][p];
    }

    void podawacz2() {
        for(int u[]: tt) {
            for(int p: u) {
                System.out.println(p);
            }
        }
    }
}

public class tworzęTablice {
    public static void  main(String arg[]) {
        wzór tabeleczka = new wzór(5, 7);

        tabeleczka.napełniacz(4);


        int jj = tabeleczka.podawacz(2,2);
        System.out.println(jj);

        System.out.println("A teraz całość tabeli:");

        tabeleczka.podawacz2();


    }
}