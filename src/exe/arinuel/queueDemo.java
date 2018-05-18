package exe.arinuel;

        class Queue {
    private char q[]; //tablica przechowywująca kolejkę
    private int putloc, getloc; //indeksy operacji put i get

    //konstruktor klasy kolejka:
    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //konstruktor przeciążony tworzy obiekt na podstawie innnego obiektu
            Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for(int i= getloc; i < putloc; i++)
            q[i] = ob.q[i];
            }

     //Tworzy kolejkę umieszczając w niej elementy:
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i = 0; i < a.length; i++) put(a[i]);
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




//Demonstruje użycie klasy Queue.
class queueDemo {
            public static void main(String arg[]) {
                Queue q1 = new Queue(10);

                char name[] = { 'J', 'a', 'n'};

                //tworzy kolejkę na podstawie tablicy:
                Queue q2 = new Queue(name);

                char ch;
                int i;

                //umieszcze znaki w kolejce q1
                for(i=0;i < 10; i++)
                    q1.put((char) ('A' + i));

                //tworzy kolejkę z innej kolejki:
                Queue q3 = new Queue(q1);

                //Wyświetla kolejki:
                System.out.print("Zawartość q1: ");
                for(i=0; i < 10; i++) {
                    ch = q1.get();
                    System.out.print(ch);
                }

                System.out.println("\n");

                System.out.print("Zawartość q2: ");
                for(i=0; i < 3; i++) {
                    ch = q2.get();
                    System.out.print(ch);
                }

                System.out.println("\n");

                System.out.print("Zawartość q3: ");
                for(i=0; i < 10; i++) {
                    ch = q3.get();
                    System.out.print(ch);
                }
            }
}






// poniższe wygaszam bo to ze starszej wersji ale może się przyda.
/*public class queueDemo {
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
*/