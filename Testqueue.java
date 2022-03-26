import java.util.Scanner;

/**
 * Created by م on 08/03/2022.
 */
public class Testqueue {
    public static void main(String[] args) {
        ArrayQueue<String> s1=new ArrayQueue<>(5);
        System.out.println("enter element in Queue ");
        Scanner in=new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            s1.enqueue(in.next());

        }
        System.out.println("size of Queue is :"+s1.size());
        for (int i = 0; i <5 ; i++) {
            System.out.print(s1.dequeue()+"\t");

        }
    }
}
