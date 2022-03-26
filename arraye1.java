import java.util.Scanner;

/**
 * Created by م on 20/01/2022.
 */
public class arraye1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in) ;
        int[] a=new int[5];
        for (int i = 0; i <a.length; i++) {
            System.out.println("Enter the elment"+(i+1)+"in array ?");
            a[i]= in.nextInt() ;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
    }
}
