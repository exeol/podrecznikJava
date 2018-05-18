package exe.arinuel;

class reku {

    int factR(int n) {
        int result;

        if(n==1) return 1;
        result = factR(n-1) * n;
        return result;
    }
}


public class rekurencja1 {
    public static void main(String arg[]){
        reku f = new reku();

        System.out.println(" silnia liczby 23 wynosi: " + f.factR(23));
    }
}
