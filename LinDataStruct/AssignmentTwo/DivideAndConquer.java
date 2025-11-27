package assignment2;

public class DivideAndConquer {

    public static int fibonacci(int n) {

        //TASK 1.A.a

        if ( n <=1 )
            return n;


        return fibonacci(n - 1 ) + fibonacci(n - 2);
    }

    public static int search(int[] A, int v)
    {
        // TASK 1.A.b

        int left = 0, right = A.length - 1;

        while (left <= right ){
            int middle = left +(right - l) / 2;

            if(A[middle] == v)
                return middle;

            if(A[middle] < v)
                left = middle + 1;

            else 
                right = middle -1;
    }
    return -1;
}

    public static void hanoi(int n, char A, char B, char C)
    {
        if(n == 0){
            return;
        }
        
        hanoi(n - 1 , A, C, B);
        System.out.print("move disk"+ n + " from rod " + A + " to rod " + B );

        hanoi(n - 1, C, B, A);
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(fibonacci(i));
        }
        System.out.println();
        for (int i=0; i<10; i++) {
            System.out.println(search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, i));
        }
        System.out.println();
        hanoi(4, 'A', 'B', 'C');
    }
}
