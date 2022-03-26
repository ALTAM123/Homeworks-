import java.util.Arrays;
import java.util.Scanner;
public class Darray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //int[] a=new int[5];
        int []a={1,2,3,4,5};
        int num;
        System.out.println("Enter to Delete ");
        num=in.nextInt();
       // shift1(a,num);
        System.out.println(Arrays.toString(shift1(a,num)) );
    }
    public static int[] shift1(int[] x,int num ){
        int a=0 ;
        for (int i = 0; i < x.length-1; i++) {
            if (x[i] == num) {
                x[i]=x[i+1];
                num=x[i+1];
                a=1;

            }

        }
        if (a!=0){
        x[x.length-1]=0;}
        return x;
    }
}
