import java.util.Scanner;

/**
 * Created bY م on 15/01/2022.
 */
public class InputArray {

    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
    }
}
