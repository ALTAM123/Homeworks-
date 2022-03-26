/**
 * Created by م on 14/03/2022.
 */
public class SingleLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tial = null;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tial.getElement();
    }

    public void addfirst(E e) {
        head = new Node<E>(e, head);
        if (size == 0)
            tial = head;
        size++;
    }

    public void addlast(E e) {
        Node<E> newest = new Node<E>(e, null);
        if (isEmpty())
            head = newest;
        else tial.setNext(newest);
        size++;

    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E del = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tial = null;
        return del;
    }


    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
