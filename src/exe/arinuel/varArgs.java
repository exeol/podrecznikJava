package exe.arinuel;

public class varArgs {


        static void vaTest ( int ...v){
            System.out.println("Liczba argumentów: " + v.length);
            System.out.println("Zawartość: ");

            for (int i = 0; i < v.length; i++)
                System.out.println(" argument " + i + ": " + v[i]);

            System.out.println();
        }

        public static void main (String arg[])
        {
            vaTest(10);
            vaTest(1, 2, 3);
            vaTest();
        }

    }
