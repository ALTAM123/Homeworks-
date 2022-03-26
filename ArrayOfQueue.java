public class ArrayOfQueue <E> implements Queue<E>{

    E[] data;
    int f =0,sz =0;
    final static int CAP = 50;

    public ArrayOfQueue(int c) {
        data = (E[]) new Object[c];
    }

    public ArrayOfQueue() {
        this(CAP);
    }

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueue(E e) {
        if (size() == data.length)
            throw new IllegalStateException("Queue is full");
        int index = (sz + f) % data.length;
        data[index] = e;
        sz++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())
        return null;
        E del = data[f];
        data[f] =null;
        f = (f+1)% data.length;
        sz--;
        return del;
    }

    @Override
    public E front() {
        if (isEmpty())
        return null;
        return data[f];
    }
}
