import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

/**
 * Created by م on 22/01/2022.
 */
public class ARRAY {
    public static void main(String[] args) {

        //int[] a=new int[5];
               int []a={1,2,3,4,5};
        System.out.println(Arrays.toString(shift1(a,1)) );
    }
    public static int[] shift1(int[] x,int a){
        int e=x[x.length-1];
        for (int i = x.length-1; i > 0; i--) {
            x[i]=x[i-1];

        }
        x[0]=e ;
        return x;
    }
}
