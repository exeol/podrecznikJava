package exe.arinuel;

class kompozytor {
    int length, width, height;

    kompozytor(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int objetosc() {
        return length*width*height;
    }
}

public class test {
    public static void main(String arg[]) {
        kompozytor bryla = new kompozytor(12, 45, 19);

        System.out.println(bryla.objetosc());
    }
}