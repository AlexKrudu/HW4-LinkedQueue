package queue;

// Inv: size >= 0 && ∀ i = 0..size-1 queue[i] != null
public interface Queue {
    // Pre: elem != null
    void enqueue(Object elem);
    // Post: size = size' + 1 && ∀ i = 0..size'-1 queue[i] = queue[i]' && queue[size - 1] = elem

    // Pre: size > 0
    Object dequeue();
    // Post: res = queue[0] && size = size' - 1 && ∀ i = 1..size queue[i] = queue[i]'


    // Pre: size > 0
    Object element();
    // Post: res = queue[0] && queue is immutable


    int size();
    // Post: res = size && queue is immutable


    boolean isEmpty();
    // Post: Res = size > 0? && queue is immutable


    void clear();
    // Post: queue is empty


    Object[] toArray();
    // Post: res = queue[0..size - 1] && type(res) = array && queue is immutable


}
