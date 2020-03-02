package queue;

public abstract class AbstractQueue implements Queue {
    protected int size;
    public void enqueue(Object elem){
        assert elem != null;
        enqueueImpl(elem);
        size++;
    }
    protected abstract void enqueueImpl(Object elem);
    public Object dequeue(){
        assert size > 0;
        Object res = element();
        size--;
        remove();
        return res;
    }
    protected abstract void remove();
    public Object element(){
        assert size > 0;
        return elementImpl();
    }
    protected abstract Object elementImpl();
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void clear(){
        size = 0;
        clearImpl();
    }
    protected abstract void clearImpl();
}
