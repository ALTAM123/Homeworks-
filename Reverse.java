import java.util.Arrays;

/**
 * Created by م on 23/01/2022.
 */
public class Reverse {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        System.out.println(Arrays.toString(Shiftelement(a)) );
    }
    public static int[]  Reverse1(int[]x){
     int n=x.length-1;
        for (int i = 0; i < x.length/2 ; i++) {
            int temp =x[i];
            x[i]=x[n];
            x[n]=temp;
            n--;
        }
        return x ;
    }
    public static int[]  Shiftelement(int[] x){
        int e=x[x.length-1];
        for (int i = x.length-1; i > 0; i--) {

            x[i]=x[i-1];

        }
        x[0]=e;
        return x ;
    }
    public static int[]  Shifteleft(int[] x){
       int  e=x[0];
        int e=x[x.length-1];
        for (int i = 0 ; i <x.length-1; i--) {

            x[i]=x[i-1];

        }

        return x ;
    }
}
