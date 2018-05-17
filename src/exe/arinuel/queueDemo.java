package exe.arinuel;

        class Queue {
    private char q[]; //tablica przechowywująca kolejkę
    private int putloc, getloc; //indeksy operacji put i get

    //konstruktor klasy kolejka:
    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" -- Kolejka pełna.");
            return;
        }


        q[putloc] = ch;
        putloc++;
    }

    char get() {
        if(getloc==putloc) {
            System.out.println(" -- Kolejka pusta.");
            return (char) 0;
        }
        return q[getloc++];
    }

}



public class queueDemo {
    public static void main(String args[]){
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        int i;
        char ch;

        System.out.println(bigQ);
        System.out.println("używam kolejki bigQ do przechowania alfabetu");

        for(i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        System.out.println("Zawartość kolejki bigQ: ");
        for(i =0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);

        }

        System.out.println();
        System.out.println();
        System.out.println("używam kolejki smallQ do generowania błędów");

        for(i = 0; i < 5; i++) {
            System.out.print("Próbuję umieścić w kolejce znak " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }

        System.out.println();

        System.out.print("Zawartość kolejki smallQ: ");
        for(i = 0; i < 5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }




    }
}