package LabTwo;

import java.util.Random;

public class InsertionSort {
    private int A[];

    public InsertionSort(int n, int min, int max)
    {
        A = new Random(42).ints(n, min, max).toArray();
    }

    public void print()
    {
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        // task 3
        int n = A.length;

        for (int i = 1; i< n; ++i){
            int key = A[i];
            int j = i -1;
            //Move elements of A[0..i-1], that are
            //greater than key, to one position ahead
            // of their current position

            while (n >0 && A[j] > key){
                A[n +1] = A[j];
                n = n -1;

            }
            A[n+1]= key;
        }
        throw new RuntimeException("Not yet implemented!!!");
    }

    public static void main(String[] args) {
        InsertionSort A = new InsertionSort(10, 0, 100);
        A.print();
        A.sort();
        A.print();
    }
}
