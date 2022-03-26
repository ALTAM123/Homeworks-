public class CircularLinkedList <E>{
    private Node<E> tail=null;
    private int size =0;

    public CircularLinkedList() {
    }

    public boolean isEmpty()
    {
        return size == 0;
    }
    public int size()
    {
        return size;
    }
    public E first()
    {
        if (isEmpty())return null;
        return tail.getNext().getElement();
    }
    public E last()
    {
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addFirst(E element)
    {
        if (isEmpty())
        {
            tail = new Node<>(element,null);
            tail.setNext(tail);
        }
        else
        {
            Node<E> n = new Node<>(element,tail.getNext());
            tail.setNext(n);
        }
        size++;
    }
    public void addLast(E element)
    {
        addFirst(element);
        tail = tail.next;
    }
    public E removeFirst()
    {
        if (isEmpty())return null;
        Node<E> x = tail.getNext();
        if (tail == x)
            tail = null;
        else
            tail.setNext(x.getNext());
        size--;
        return x.getElement();
    }
    public void rotate()
    {
        if (tail != null)
            tail = tail.getNext();
    }
    public E josaaph( int k)
    {
        if (isEmpty()) return null;
        while (size > 1)
        {
            for (int i = 0; i < k-1; i++) {
                rotate();
            }
            removeFirst();
        }
        return first();
    }


    private static class Node<E>{
        E element;
        Node<E> next;

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

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
