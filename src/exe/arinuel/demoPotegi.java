package exe.arinuel;



class potegi {
    double b;
    int e;
    double val;

    potegi(double base, int exp) {
        b = base;
        e = exp;
        val = 1;
        if(exp == 0) return;
        for( ; exp>0; exp--) val = val * base;
    }

    double get_potege() {
        return val;
    }
}

public class demoPotegi {
    public static void main(String args[]) {
        potegi x = new potegi(4.0, 2);
        potegi y = new potegi(2.5, 1);
        potegi z = new potegi(5.7, 0);

        System.out.println(x.b + " podniesione do potęgi " + x.e + " równa się " + x.get_potege());
        System.out.println(y.b + " podniesione do potęgi " + y.e + " równa się " + y.get_potege());
        System.out.println(z.b + " podniesione do potęgi " + z.e + " równa się " + z.get_potege());
    }
}
