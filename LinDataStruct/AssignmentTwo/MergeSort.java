package assignment2;

public class MergeSort {

    private static int[] merge(int[] A1, int[] A2)
    {
        // TASK 2.A.a
        int totalLength = A1.length + A2.length;
        int[] A = new int[totalLength];

        int i = 0 , j = 0;

        for (int k = 0; k < totalLength; k++){
            if(k < A2.length && i < A1.length){

                if(A1[i] <= A2[j]){
                    A[k] = A1[i];
                    i++;
                }
                else{
                    A[k] = A2[j];
                    j++;
                }

            }
        }
        return A;

    }

    public static int[] mergesort(int[] A)
    {
        // TASK 2.A.b
        if(A.length <= 1){
            return A;
        }
        int midd = A.length  / 2;
        int[] A1 = new int[midd];
        int[] A2 = new int[A.length - midd];

        for(int i = 0; i < midd; i++){
            A1[i] = A[i];
        }

        for(int i = midd; i < A.lenght; i++){
            A2[i - midd] = A[i];
        }

        int[] A1Sorted= mergesort(A1);
        int[] A2Sorted = mergesort(A2);

        return merge(A1Sorted, A2Sorted);
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
        print(merge(new int[] {1,3,5,7,9}, new int[] {2,4,6,8}));
        print(mergesort(new int[] {5,2,8,1,3,9,7,4,6} ));
    }

}
