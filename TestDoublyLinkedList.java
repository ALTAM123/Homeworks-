package Fifth_Lab;

import java.util.Scanner;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<String> dList = new DoublyLinkedList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter\n 1- To AddFirst. \n 2- To AddLast. \n 3- To RemoveFirst. \n 4- To RemoveLast.\n");
        for (int i = 0; i < 4; i++) {
            int choice;
            System.out.println("Your Choice");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input Name : ");
                    dList.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input Name : ");
                    dList.addLast(in.next());
                    break;
                case 3:
                    System.out.println("Deleted Name : "+dList.removeFirst());
                    break;
                case 4:
                    System.out.println("Deleted Name : " + dList.removeLast());
                    break;
            }
            System.out.println("\nFirst = " + dList.first()+"\t Last = " + dList.last()+"\tSize = " + dList.size());
        }
    }
}
