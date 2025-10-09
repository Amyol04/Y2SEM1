package LabOne;

import java.util.Random;

public class SimpleArrayOperations {
    private int A[];

    public SimpleArrayOperations(int n, int min, int max)
    {
        A = new Random(42).ints(n, min, max).toArray(); //generates random away. 
    }

    public void print()
    {
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public int get(int i) // get works by wanting to return something, 
    {
            return A[i];  
    }

    public int find(int v)
    {
        // Task 5.B
        for (int i = 0; i<A.length; i++){ //looping through the array. 
            if (A[i] == v){ //checks if a[i] == v 
                return i;//if it is it returns i. returns indec of first match
            }
        }
        return -1; //indicates not found. 
    }


    public void swap(int i, int j)
    {
       int temp = A[i]; //holding the A[i]
       A[j] = A[i]; // swaps them
       A[j] = temp; // now I is swapped with J 
        
    }

    public static void main(String[] args) {
        SimpleArrayOperations A = new SimpleArrayOperations(10, 0, 100);
        A.print();
        int v = A.get(6);
        System.out.println("A[6] = " + v);
        int i=A.find(v);
        System.out.println("A[" + i + "] = " + v);
        A.swap(3, 4);
        A.print();
    }
}
