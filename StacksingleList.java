/**
 * Created by م on 15/03/2022.
 */
public class StacksingleList<E> implements Stack<E> {
    SinglyLinkedList<E> list =new SinglyLinkedList<E>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);

    }

    @Override
    public E pop() {return list.removeFirst();
    }

    @Override
    public E top() {
       return list.first();
    }
}
