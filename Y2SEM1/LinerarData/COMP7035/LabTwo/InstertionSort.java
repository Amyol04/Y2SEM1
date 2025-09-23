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
        int n = A.length; // how many numbers in the list

        for (int j = 1; j< n; j++){
            int key = A[j];
            int i = j -1;
            //Move elements of A[0..i-1], that are
            //greater than key, to one position ahead
            // of their current position

            while (i >= 0 && A[i] > key){
                A[i +1] = A[i];
                i = i -1;

            }
            A[i+1]= key;
        }
    }

    public static void main(String[] args) {
        InsertionSort A = new InsertionSort(10, 0, 100);
        A.print();
        A.sort();
        A.print();
    }
}
