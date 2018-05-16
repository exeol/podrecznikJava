package exe.arinuel;



class myClass2 {
    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }

}




public class accessDemo {
    public static void main(String arg[]) {
        myClass2 something = new myClass2();

        something.setAlpha(5);
        System.out.println(something.getAlpha());

        something.alpha = 5;
    }
}
