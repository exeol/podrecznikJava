package exe.arinuel;

public class bubble {
    public static void main(String args[]) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, t;
        int size;

        size = 10;

        //wyświetla oryginalną tablicę
        System.out.println("Oryginalna tablica: ");
        for(int i=0; i<size; i++)
            System.out.println(nums[i]);
        System.out.println();

        //sortowanie pęcherzykowe
        for(a=1; a < size; a++)
            for(b=size-1; b>=a; b--) {
                if (nums[b - 1] > nums[b]) {

                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
            System.out.print("Posortowana tablica: ");
        for(int i=0; i<size; i++)
        System.out.println(nums[i]);
        System.out.println();
    }
}
