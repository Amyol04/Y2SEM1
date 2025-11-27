package assignment2;

public class QuickSort {

    private static int partition(int[] A, int p, int r)
    {
        // TASK 2.B.a
        x = A[r];

        i = p -1;

        for(int j = p; j <= r-1; j++){
            if (A[j] <= x){
            i++;

            int temp = A[i];

            A[i +1 ] = A[r];
            A[r] = temp;
          }
        }

        int temp = A[i +1];
        A[i+1] = A[r];
        A[r] = temp;

        return i + 1;
    }

    private static void quicksort(int[] A, int p, int r)
    {
        // TASK 2.B.b
        if (p < r){
            q = partition(A, p, r);
            quicksort(A,p,q -1);
            quicksort(A, q + 1, r);
        }
    }

    public static void quicksort(int[] A)
    {
        quicksort(A, 0, A.length-1);
    }

    private static void print(int[] A)
    {
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + ((i<A.length-1)?", ":""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = new int[] {5,2,8,1,3,9,7,4,6};
        quicksort(A);
        print(A);
    }

}
