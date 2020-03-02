package queue;

// Inv: size >= 0 && ∀ i = 0..size-1 queue[i] != null
public class LinkedQueue extends AbstractQueue {
    private Node tail;
    private Node head;
    private int size;

    // Pre: elem != null
    public void enqueueImpl(Object elem) {
        Node n = tail;
        tail = new Node(elem, null);
        if (isEmpty()) {
            head = tail;
        } else {
            n.next = tail;
        }
    }
    // Post: size = size' + 1 && ∀ i = 0..size'-1 queue[i] = queue[i]' && queue[size - 1] = elem


    // Pre: size > 0
    public void remove() {
        if (size != 1){
        head = head.next;}
        else{
            head = null;
            tail = null;
        }
    }
    // Post: res = queue[0] && size = size' - 1 && ∀ i = 1..size queue[i] = queue[i]'

    // Pre: size > 0
    public Object elementImpl() {
        return head.value;
    }
    // Post: res = queue[0] && queue is immutable
    /*
    public int size() {
        return size;
    }*/
    // Post: res = size && queue is immutable

    public void clearImpl() {
        head = null;
        tail = null;
    }
    // Post: queue is empty

    /*
    public boolean isEmpty() {
        return size == 0;
    }*/
    // Post: Res = size > 0? && queue is immutable


    private class Node {
        private Node next;
        private Object value;

        public Node(Object value, Node next) {
            this.next = next;
            this.value = value;
        }
    }
}
