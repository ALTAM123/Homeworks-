/**
 * Created by م on 15/03/2022.
 */
public class QueueList<E> implements Queue<E>{
    SinglyLinkedList<E> list=new SinglyLinkedList<E>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void enqueue(E e) {
        list.addLast(e);

    }

    @Override
    public E dequeue() {
       return list.removeFirst();
    }

    @Override
    public E front() {
        return list.first();
    }
}
