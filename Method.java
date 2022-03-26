import java.util.Scanner;

/**
 * Created by م on 15/01/2022.
 */
public class Method {
    public static void output(int[] x){
        for (int i = 0; i <x.length ; i++) {
            System.out.println(x[i]);

        }
    }
    public static void  input(int x[]){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <x.length ; i++) {
            x[i]=in.nextInt();
        }

    }

    public static void main(String[] args) {
        int array[]=new int[5];
        input(array);
        output(array);

    }

}
