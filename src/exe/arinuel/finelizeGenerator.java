package exe.arinuel;


class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    protected void finalize() {
        System.out.println("usuwanie obiektu o identyfikatorze " + x);
    }

    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}

public class finelizeGenerator {
    public static void main(String args[]) {
        int count;

        FDemo ob = new FDemo(0);

        for(count = 1; count < 1000000; count++)
            ob.generator(count);

    }
}
