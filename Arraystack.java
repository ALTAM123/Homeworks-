import java.awt.geom.IllegalPathStateException;
import java.util.IllegalFormatCodePointException;

/**
 * Created by م on  22/01/2022.
 */
public class Arraystack<E> implements Stack<E> {

    static int capacity=100;
    E data[];
    int t=-1;

    public Arraystack(int capacity) {
        data= (E[]) new Object[capacity];
    }

    public Arraystack() {
        this(capacity);
    }

    @Override
    public boolean isEmpty() {
        return t ==-1;
    }

    @Override
    public int size(



    ) {
        return t+1;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
    return data[t];
    }

    @Override
    public void push(E element) {
        if (size() ==data.length) throw  new IllegalPathStateException("stack is ful");

        data[++t]=element;
    }

    @Override
    public E pop() {
        if (isEmpty())return null ;

        E del=data[t];
        data[t]=null;
        t--;
        return del;
    }
}
