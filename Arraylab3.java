/**
 * Created by م on 31/01/2022.
 */
public class Arraylab3 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        Shiftright(a);
        //Shiftleft(a) ;
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

    }
public static int[]  Shiftright(int[] a){
    int e=a[a.length-1];
    for (int i = a.length-1; i >0 ; i--) {
        a[i]=a[i-1];
    }
    a[0]=e;
    return a ;

}
public static int[] Shiftleft(int[] a){
    int e=a[0];
    for (int i = 0; i <a.length-1 ; i++) {
        a[i]=a[i+1];
    }
    a[a.length-1]=e;
return a ;

}

}
