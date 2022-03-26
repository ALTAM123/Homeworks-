/**
 * Created by م on 08/03/2022.
 */
public class ArrayQueue<E> implements Queue<E>{
   static int CAPCITY=100;
    E data[];
    int f=0;
    int sz=0;

    public ArrayQueue(int cap) {
        data=(E[]) new  Object[cap];
    }

    public ArrayQueue() {
        this(CAPCITY);
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public E first() {
        if(isEmpty())return null;
        return data[f];
    }

    @Override
    public void enqueue(E e) {
        if(size()==data.length) throw new IllegalStateException("Queue is full");
        int index=(f+sz)%data.length;
        data[index]=e ;
        sz++;



    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;

            E de=data[f];
            data[f]=null;
            f=(f+1)%data.length;
            sz--;
            return de;

    }
}
