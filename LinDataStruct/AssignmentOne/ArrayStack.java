package Assignment1;

public class ArrayStack implements Stack<Object> {

    private Object[] S;
    private int capacity;
    private int top;

    public ArrayStack(int capacity) {
        // TASK 2.A.a

        this.capacity = capacity;
        this.S = new Object[capacity];
        this.top = -1;
    }

    public void push(Object x) {
        // TASK 2.A.b

        if(top == capacity -1){
            System.out.println("Stack Overflow");
            return;
        }
        S[top++] = x;
    }

    public Object pop() {
        // TASK 2.A.c
        if (top == -1){
            return null;
        } else{
        top --;
        return S[top--];
        }
    }

    public Object peek() {
        // TASK 2.A.d
        if (top == -1){
            System.out.println("Stack is empty");
        }
        return S[top];
    }

    public boolean empty() {
        // TASK 2.A.e
        return top == -1;
    }

    public static void main(String[] args) {
        Stack<Object> test = new ArrayStack(20);
        System.out.println(test.empty());
        for (int i=0; i<10; i++) {
            test.push(i+100);
        }
        System.out.println(test.empty());
        System.out.println(test.peek());
        for (int i=0; i<5; i++) {
            int x = (int)test.pop();
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i=0; i<15; i++) {
            test.push(i);
        }
        while (!test.empty()) {
            int x = (int)test.pop();
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
