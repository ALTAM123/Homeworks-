/**
 * Created by م on 15/03/2022.
 */
public class TestCircularyLinkedList {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list =new CircularlyLinkedList<>();
        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        int n=list.size();
        for (int i = 0; i <n ; i++) {
            System.out.println(list.first());
            list.rotate();

        }
        System.out.println(list.size());
    }
}
