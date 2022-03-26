.

/**
 * Created by م on 14/03/2022.
 */
public class DoubleLinkedList<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public DoubleLinkedList() {
        header = new Node<E>(null, null, null);
        trailer = new Node<E>(null, header, null);
        header.setNext(trailer);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getE();
    }

    public E last() {
        if (isEmpty()) return null;
        return trailer.getPrev().getE();
    }


    private static class Node<E> {
        private E e;
        private Node<E> prev = null;
        private Node<E> next = null;

        public Node(E e, Node<E> prev, Node<E> next) {
            this.e = e;
            this.prev = prev;
            this.next = next;
        }

        public E getE() {
            return e;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setE(E e) {
            this.e = e;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
