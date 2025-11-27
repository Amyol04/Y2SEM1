package assignment2;

public class HeapOfBinaryTries {
    private BinaryTrie[] A;
    private int heapsize;

    private void heapify(int i)
    {
        // TASK 3.A.a
        int l = left(2 * i) + 1;
        int r = right(2 *i) + 2;

        int smallest = i;  

        if(l <= heapsize && A[l].compare(A[i])){
            smallest = l;
        }
        if(r <= heapsize && A[r].compare(A[smallest])){
            smallest = r;
        }

        if(smallest != i){
            int temp = A[i];

            A[i] = A[smallest];
            A[smallest] = temp;

            heapify(smallest);
        }
    }

    public HeapOfBinaryTries(BinaryTrie[] A)
    {
        // TASK 3.A.b
        this.A = A;
        this.heapsize = A.length;

        for(int i = (heapsize / 2 ) - 1; i>0; i--){
            heapify(i);
        }
        
    }

    public BinaryTrie extractMin()
    {
        // TASK 3.A.c

        if(heapsize == 0){
            return "head is empty";
        }

        BinaryTrie min = A[1]; 

        A[1] = A[heapsize - 1];
        heapify--;
        heapify(A,1);
        return min;
    }

    public void insert(BinaryTrie x) {
        // TASK 3.A.d

        heapsize++;
        int i = heapsize;
        A[i] = x;


        while(i > 1 && A[(parent(i))].compare(A[i])){
            A[i] = A[parent(i)];
            i = parent(i);
        }

        A[i] = x;
    }

    public int size()
    {
        return heapsize;
    }
}
