import java.util.Scanner;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayOfQueue<Integer> q = new ArrayOfQueue<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("input element");
        for (int i = 0; i < 5; i++) {
            q.enqueue(in.nextInt());
        }
        System.out.println("deleted element");
        for (int i = 0; i < 5; i++) {
            System.out.println(q.dequeue());
        }
    }
}
