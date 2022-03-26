import java.util.Scanner;

/**
 * Created by LAB on 3/7/2022.
 */
public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while (choice != 0)
        {
            System.out.println("Number 1 is add first \tNumber 2 is add last \tNumber 3 is remove first \tNumber 4 is remove last \tNumber 0 exit \t");
            choice = in.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("input the name");
                    list.addFirst(in.next());
                    break;
                case 2 :
                    System.out.println("input the name");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println(list.removeFirst());
                    break;
                case 4:
                    System.out.println(list.removeLast());
                    break;
                case 0 :
                    System.exit(0);
                    default:
                        System.out.println("Your choice is incorrect");
            }
            System.out.println("first = " + list.first() +"\tLast = "+ list.last()+"\tsize = "+ list.size());
        }
    }
}
