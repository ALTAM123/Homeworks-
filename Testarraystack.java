/**
 * Created by م on 22/01/2022.
 */
public class Testarraystack
{
    public static void main(String[] args) {
        Arraystack<Integer>stack=new Arraystack<>();
        stack.push(11);
        stack.push(12);
        stack.push(13);
     // stack.push(14);
        System.out.println(stack.size());
        while (!stack.isEmpty())
            System.out.println(stack.pop());



    }



}
