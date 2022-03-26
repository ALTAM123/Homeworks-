/**
 * Created by م on 15/03/2022.
 */
public class CircularlySingleLinkedList<E>  {
   private Node<E> tail=null;
   private int size =0;
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public E first(){
        if (isEmpty())return null;
        return tail.getNext().getE();
    }
    public E last(){
        if (isEmpty())return null;
        return tail.getE();
    }
    public void rotate(){
        if (tail!=null)
            tail=tail.getNext();

    }
   public void addfirst(E element){
       if (size==0)
       {
           tail=new Node<E>(element,null);
           tail.setNext(tail);
       }
       else {
           Node<E> newst=new Node<E>(element,tail.getNext());
           tail.setNext(newst);
       }
       size++;
   }
   public void addlast(E element){
       addlast(element);
       tail=tail.getNext();
   }

   public E remove(){
       if (isEmpty())return null;
       Node<E> x=tail.getNext();
       if (x==tail)
           tail=null;
       else tail.setNext(x.getNext());
       size--;
       return x.getE();
   }





    private static class Node<E>{
      private   E e ;
       private Node<E> next ;

        public Node(E e, Node<E> next) {
            this.e = e;
            this.next = next;
        }

        public void setE(E e) {
            this.e = e;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getE() {

            return e;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
