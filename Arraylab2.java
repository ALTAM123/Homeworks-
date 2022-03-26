/**
 * Created by م on 31/01/2022.
 */
public class Arraylab2 {
    public static void main(String[] args) {

        int  num[]={1,2,3,4,5};
       reverse(num);

        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);
        }

}


public static int[] reverse(int[] num){
    int n=num.length-1;

    for (int i = 0; i <num.length/2 ; i++) {
        int temp=num[i];
        num[i]=num[n];
        num[n]=temp;
        n--;
    }
 return num;
 }
}