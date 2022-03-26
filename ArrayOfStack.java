public class ArrayOfStack <E> implements Stack<E>{

    E[] data;
    int t ;
    final static int CAP = 50;

    public ArrayOfStack(int c) {
        data = (E[]) new Object[c];
        t = -1;
    }

    public ArrayOfStack() {
        this(CAP);
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E e) {
        if ( t == data.length-1)
            throw new IllegalStateException("Stack is full");
        data[++t] = e;
    }

    @Override
    public E pop() {
        if (isEmpty())
        return null;
        E del = data[t];
        data[t] = null;
        t--;
        return del;
    }

    @Override
    public E top() {
        if (isEmpty())
        return null;
        return data[t];
    }
}
