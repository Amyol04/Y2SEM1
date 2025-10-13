package Assignment1;

public class DoubleLinkedList implements List<Object> {
    private class ListNode {
        public ListNode(Object x) {
            key = x;
        }
        public Object key;
    }

    private ListNode head;
    private ListNode tail;

    public DoubleLinkedList()
    {
        // TASK 1.A
       this.head = null;
       this.tail = null;
    }

    public void prepend(Object x) {
        // TASK 1.B

        ListNode newNode = new ListNode(x);

        if(head==null){
        head = tail = newNode;
        }
        else { 
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    public Object getFirst() {
        // TASK 1.C

        if (head == null){
            System.out.println("List is empy");
            return null;
        }
        return head.key;
    }

    public void deleteFirst() {
    // TASK 1.D

    if(head == null){ 
        System.out.println("list is empty");
        return;
    } 
    if(head == tail) {
        head = tail = null;
    }
    else {
        head = head.next;
        head.prev = null;
    }
}
public void append(Object x) {
    ListNode newNode = new ListNode(x);

    if (head == null) {
        head = tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
}
    public Object getLast() {
        // TASK 1.F
        if (tail == null){
            System.out.println("List is empy");
            return null;
        }
        return tail.key;
    }

    public void deleteLast() {
        // TASK 1.G
     if(tail == null){ 
        System.out.println("list is empty");
        return;
    } 

    if(tail == head) {
        tail = head = null;
    }
    else {
        tail.next = null;
    }
}

    public boolean empty() {
        // TASK 1.H
    return head == null;
    }

    public static void main(String[] args) {
        List<Object> test = new DoubleLinkedList();
        System.out.println(test.empty());
        for (int i=0; i<10; i++) {
            test.prepend(i + 100);
        }
        System.out.println(test.empty());
        for (int i=0; i<5; i++) {
            int x = (int)test.getFirst();
            System.out.print(x + " ");
            test.deleteFirst();
        }
        System.out.println();
        for (int i=0; i<10; i++) {
            test.append(i + 200);
        }
        while (!test.empty()) {
            int x = (int)test.getLast();
            System.out.print(x + " ");
            test.deleteLast();
        }
    }
}
