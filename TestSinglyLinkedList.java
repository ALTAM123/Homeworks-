public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(5);
        list.addFirst(4);
        list.addLast(10);
        list.addFirst(3);
        System.out.println("first = " + list.first()+"\tLast = "+list.last());
        list.print();

        System.out.println(list.removeFirst());
    }
}
