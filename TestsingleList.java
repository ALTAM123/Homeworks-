/**
 * Created by م on 14/03/2022.
 */
public class TestsingleList {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<>();
        System.out.println(list.size());
        list.addfirst("mohsen");
        list.addlast("fahd");
        System.out.println(list.size());
        while (!list.isEmpty())
            System.out.println(list.removeFirst());
        System.out.println(list.size());
    }

}