package queue;

public class LinkedQueue extends AbstractQueue {
    private Node tail;
    private Node head;
    private int size;

    public void enqueueImpl(Object elem) {
        Node n = tail;
        tail = new Node(elem, null);
        if (isEmpty()) {
            head = tail;
        } else {
            n.next = tail;
        }
    }

    public Object[] toArray() {
        Object[] res = new Object[size()];
        Node cur = head;
        for (int i = 0; i < size(); i++) {
            res[i] = head.value;
            cur = cur.next;
        }
        return res;
    }

    public void remove() {
        if (size != 1) {
            head = head.next;
        } else {
            head = null;
            tail = null;
        }
    }

    public Object elementImpl() {
        return head.value;
    }


    public void clearImpl() {
        head = null;
        tail = null;
    }


    private class Node {
        private Node next;
        private Object value;

        public Node(Object value, Node next) {
            this.next = next;
            this.value = value;
        }
    }
}
