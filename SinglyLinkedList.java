public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E element) {
        head = new Node<E>(element, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void addLast(E element) {
        Node<E> newset = new Node<>(element, null);
        if (isEmpty())
            head = newset;
        else
            tail.setNext(newset);
        tail = newset;
        size++;
    }

    public E removeFirst() {
        if (isEmpty())
            return null;
        E del = head.getElement();
        head = head.next;
        size--;
        if (size == 0)
            tail = null;
        return del;
    }

    public void print() {
        if (isEmpty())
            System.out.println("null");
        else {
            Node<E> p = head;
            while (p != null) {
                System.out.println(p.getElement());
                p = p.getNext();
            }
        }

    }

    private class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
