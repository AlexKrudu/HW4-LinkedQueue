import queue.*;
public class Main {
    public static void fill(Queue queue) {
        for (int i = 0; i < 1; i++) {
            queue.enqueue(i);
        }
    }

    public static void dump(Queue queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.size() + " " +
                    queue.element() + " " + queue.dequeue());
        }
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        fill(queue);
        dump(queue);
    }
}
