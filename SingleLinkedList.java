package Third_Lab;

public class SingleLinkedList<E> {
    public class Node<E>{
        private E element;
        private Node<E>next;

        public Node(E elemnt, Node<E> next) {
            this.element = elemnt;
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

    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

//    public SingleLinkedList(){}
    public boolean IsEmpty(){return size==0;}

    public int size (int size){
    return size;
    }

    public E first(){
        if (IsEmpty()==true)
            return null;
        return head.getElement();
    }
    public E last(){
        if (IsEmpty()==true)
            return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        head =new Node<E>(e,head);
        if (size==0)
            tail=head;
        size++;
    }

    public void addLast(E e){
        Node<E>n= new Node<E>(e,tail);
        if (size==0)
            head=n;
        else
            tail.setNext(n);
        tail=n;
        size++;
    }
    public E removeFirst(){
        if (IsEmpty()==true)
            return null;
        E c= head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return c;
    }
    public E find(Node<E> e){
        Node<E> x=e;
        if (x == null || x.getNext()==null)return null;
        while (x.getNext().getNext() != null){
            x = x.getNext();
        }
        return null;
    }
}
