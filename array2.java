import java.util.Scanner;

/**
 * Created by م on 20/01/2022.
 */
public class array2 {
    public static void main(String[] args) {
        int[] a=new int[5];
        input(a);
        output(a);

    }
    public static void input(int[] a){
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            a[i]=input.nextInt();
        }
    }
    public static void output(int a[]){
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
    }
}
