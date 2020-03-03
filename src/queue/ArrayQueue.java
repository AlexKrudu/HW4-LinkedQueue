package queue;

import java.util.Arrays;

public class ArrayQueue extends AbstractQueue {
    private int head;
    private int tail;
    private int size;
    private Object[] elements = new Object[5];

    public void enqueueImpl(Object elem) {
        ensureCapacity(size() + 1);
        elements[tail] = elem;
        tail = (tail + 1) % elements.length;
    }


    private void ensureCapacity(int capacity) {
        if (capacity < elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * capacity];
        for (int i = 0; i < size(); i++) {
            newElements[i] = elements[(head + i) % elements.length];
        }
        tail = size();
        head = 0;
        elements = newElements;
    }

    public void remove() {
        elements[head] = null;
        head = (head + 1) % elements.length;

    }


    public Object[] toArray() {
        Object[] res = new Object[size()];
        for (int i = 0; i < size(); i++) {
            res[i] = elements[(head + i) % elements.length];
        }
        return res;
    }


    public Object elementImpl() {
        return elements[head];
    }


    public void clearImpl() {
        Arrays.fill(elements, null);
        head = 0;
        tail = 0;
    }


}
