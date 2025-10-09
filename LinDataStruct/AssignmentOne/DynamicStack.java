package Assignment1;

public class DynamicStack implements Stack<Object> {
    List<Object> S = new DoubleLinkedList();

    public void push(Object x) {
        // TASK 2.B.a
        S.prepend(x);
    }

    public Object pop() {
        // TASK 2.B.b

    if (S.empty()){
        System.out.println("Stack Underflow");

     } else{
        S.deleteLast();
        return S.getFirst();

     }
    return -1;
}

    public Object peek() {
        // TASK 2.B.c
        if (S.empty()){
            System.out.println("Stack is empty");
        }
        return S.getFirst();
    }

    public boolean empty() {
        // TASK 2.B.d
        return S.empty();
    }

    public static void main(String[] args) {
        Stack<Object> test = new DynamicStack();
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
