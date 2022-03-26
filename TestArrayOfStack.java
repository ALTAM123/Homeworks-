import java.util.Arrays;
import java.util.Scanner;

public class TestArrayOfStack {
    public static void main(String[] args) {
        int[] a ={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        ArrayOfStack<Integer> s = new ArrayOfStack<>(5);
        for (int i = 0; i < 5; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i < 5; i++) {
            a[i] = s.pop();
        }
        System.out.println(Arrays.toString(a));
       /* Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            s.push(in.next());
        }
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.top()+ "\tsize = "+ s.size());*/
    }
}
