/**
 * Created by م on 31/01/2022.
 */
public class Arrayadd {
    static int numofElements=0;
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println(numofElements);

        addelement(20,a);
        System.out.println(numofElements);

        addelement(20,a);
        System.out.println(numofElements);

        addelement(20,a);
        System.out.println(numofElements);

        addelement(20,a);
        System.out.println(numofElements);
        addelement(20,a);
        addelement(20,a);
        System.out.println(numofElements);

    }
    public static void addelement(int e,int[]a){

        if (numofElements < a.length) {
            a[numofElements]=e ;
            numofElements++;}
            else
            System.out.println("cann't edd elemnt");

        }
    }

