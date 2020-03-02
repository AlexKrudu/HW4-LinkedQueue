package queue;

public interface Queue {
    void enqueue(Object elem);
    Object dequeue();
    Object element();
    int size();
    boolean isEmpty();
    void clear();

}
