package Assignment1;

public class ArrayQueue implements Queue<Object> {
    private Object[] Q;

    private int tail;
    private int head;
    private int size;

    public ArrayQueue(int capacity) {
        // TASK 3.A.a
        this.capacity = capacity;
        Q = new int[capacity];
        size = 0;
    }

    public void enqueue(Object x) {
        // TASK 3.A.b
        if(isFull()){
            System.out.println("Queue is full!");
            head = 0;
            tail = 0;
        }
        Q[tail] = x;
        size++;
    }

    public Object dequeue() {
        // TASK 3.A.c
         if(size == 0){
            System.out.println("Queue is empty");
        }

        for(int i = 1; i < size; i++){
            Q[i -1] = Q[i];
            if (head == n) {
            head = -1;
        } else {
            head++;
        }
     }
        return x;
    }

    public Object next() {
        // TASK 3.A.d
        if(size ==0){
            system.out.println("Queue is empty");
        }
        else{
            return head;
        }
    }

    public boolean empty() {
        // TASK 3.A.e
         return size == 0;
    }

    public static void main(String[] args) {
        Queue<Object> test = new ArrayQueue(20);
        System.out.println(test.empty());
        for (int i=0; i<10; i++) {
            test.enqueue(i+100);
        }
        System.out.println(test.empty());
        System.out.println(test.next());
        for (int i=0; i<5; i++) {
            int x = (int)test.dequeue();
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i=0; i<15; i++) {
            test.enqueue(i);
        }
        while (!test.empty()) {
            int x = (int)test.dequeue();
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

