import java.util.Scanner;

public class TestCirucularLinkedList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        for (int i = 0; i < 6; i++) {
            list.addLast(i+1);
        }
        System.out.println(list.josaaph(3));

/*        CircularLinkedQueue<String> q = new CircularLinkedQueue<>();
        q.enqueue(in.next());
        System.out.println("first = "+ q.first());

        q.enqueue(in.next());
        System.out.println("first = "+ q.first());
        System.out.println("remove = "+ q.dequeue());


        q.enqueue(in.next());
        System.out.println("first = "+ q.first());
        System.out.println("remove = "+ q.dequeue());
        System.out.println("first after remove = "+ q.first());*/
       /* CircularLinkedStack<Integer> s = new CircularLinkedStack<>();         Stack Linked List
        s.push(4);
        s.push(9);
        System.out.println(s.top());
        s.push(8);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());*/


        /*
        CircularLinkedList<String> list = new CircularLinkedList<>();
        int choice = -1;
        while (choice != 0) {
            System.out.println("number 1 add first\tnumber 2 add last\tnumber 3 rotate\tnumber 4 remove first\t0 exit");
            System.out.print("input your choice : ");
            choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input the element");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input the element");
                    list.addLast(in.next());
                    break;
                case 3:
                    list.rotate();
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("\t\tfirst = "+ list.first()+ "\tlast = "+list.last()+"\tsize = "+ list.size()+"\n");
        }*/
    }
}
