package Assignment1;

public class ArrayQueue implements Queue<Object> {
    private Object[] Q;

    public ArrayQueue(int capacity) {
        // TASK 3.A.a
        throw new RuntimeException("Not implemented yet!");
    }

    public void enqueue(Object x) {
        // TASK 3.A.b
        throw new RuntimeException("Not implemented yet!");
    }

    public Object dequeue() {
        // TASK 3.A.c
        throw new RuntimeException("Not implemented yet!");
    }

    public Object next() {
        // TASK 3.A.d
        throw new RuntimeException("Not implemented yet!");
    }

    public boolean empty() {
        // TASK 3.A.e
        throw new RuntimeException("Not implemented yet!");
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
