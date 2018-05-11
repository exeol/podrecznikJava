package exe.arinuel;

public class myClass {
    int x;

    myClass(int i) {
        x = i;
    }
}

class consDemo {
    public static void main(String args[]) {
        myClass t1 = new myClass(88);
        myClass t2 = new myClass(44);

        System.out.println(t1.x + " " + t2.x);
    }
}
