/**
 * Created by م on 13/03/2022.
 */
public class Josephus {

    public static <E> E Josephus(ArrayOfQueue<E> queue, int k) {
         if (queue.isEmpty( )) return null;
         while (queue.size( ) > 1) {
             for (int i=0; i < k-1; i++) // skip past k-1 elements
             queue.enqueue(queue.dequeue());
            E e = queue.dequeue( ); // remove the front element from the collection
             System.out.println(" " + e + " is out");
             }
         return queue.dequeue( ); // the winner

         }
    public static <E> ArrayOfQueue <E> buildQueue(E[] a) {
    ArrayOfQueue<E> queue = new ArrayOfQueue<E>( );
         for (int i=0; i<a.length; i++)
            queue.enqueue(a[i]);
         return queue;
        }

        public static void main(String[] args) {
            String[ ] a1 = {"ibrahim", "hussein", "mohmmed", "ahmed", "abdulaziz", "abdulsalam","mohsen"};
            String[ ] a2={"a","b","c","d"};
            System.out.println("First winner is " + Josephus(buildQueue(a2),2));



        }




}

