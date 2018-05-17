package exe.arinuel;


class FailSoftArray {
    private int a[];
    private int errval;

    public int length;

    public FailSoftArray(int size, int errv) {
        a = new int [size];
        errval = errv;
        length = size;
    }


    public int get(int index) {
        if(indexOK(index)) return a[index];
        return errval;
    }


    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }


    private boolean indexOK(int index) {
        if(index >= 0 & index <length) return true;
        return false;
    }
}

public class FSDemo {
    public static void main(String arg[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        System.out.println(" Przykład błędnego dostępu do tablicy.");
        for(int i=0; i < (fs.length * 2); i++)
            fs.put(i, i*10);

        for(int i =0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
        }

        System.out.println("");


        System.out.println("\nKomunikat o błędnym dostępie.");
        for(int i = 0; i < (fs.length *2); i++)
            if(!fs.put(i, 1*10))
                System.out.println("Indeks " + i + " spoza zakresu tablicy");

        for(int i=0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
            else
                System.out.println("Indeks " + i + " spoza zakresu tablicy");
        }

    }
}
