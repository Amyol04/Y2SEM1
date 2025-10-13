package Assignment1;

public class ArrayQueue implements Queue<Object> {
    private Object[] Q;

    private int tail;
    private int head;
    private int size;

    public ArrayQueue(int capacity) {
        // TASK 3.A.a
        this.Q = new Object[capacity];
        head =0;
        tail = 0;
        size = 0;
    }

    public void enqueue(Object x) {
        // TASK 3.A.b
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        Q[head] = x;
        head = (head + 1) % Q.length;
        size++;
    }

    public Object dequeue() {
        // TASK 3.A.c
          if(empty()){
            System.out.println("Queue is empty");
        }

        Object x = Q[tail];
        tail = (tail + 1) % Q.length;
        size--;
        return x;
    }

    public Object next() {
        // TASK 3.A.d
        if(empty()){
            system.out.println("Queue is empty");
        } 
        else{
            return Q[tail];
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


