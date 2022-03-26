/**
 * Created by م on 08/03/2022.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E e);
    E dequeue();

}
