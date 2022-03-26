import java.util.Scanner;

/**
 * Created by م on 20/01/2022.
 */
public class management {
    public static void main(String[] args) {
        student[] team = new student[3];
       // student s1 = new student(123, "mohsen");
        //s1.toString();
        Scanner in=new Scanner(System.in);
         for (int i = 0; i <team.length ; i++) {
            student s=new student(in.nextInt(),in.next());
             team[i]=s;
        }
        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
        }
    }
}
