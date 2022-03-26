public class TestLinkedStack {
    public static void main(String[] args) {
        ///////////Test Queue /////////////////
        QueueList<Integer> q=new QueueList<>();
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.enqueue(400);
        System.out.println("size of queue is  "+q.size());
        while (!q.isEmpty()){
            System.out.println(q.dequeue());
        }
        System.out.println("size of queue is  "+q.size());


        ////////////Test stack///////////////////////

        StacksingleList<Integer> s = new StacksingleList<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(100);
        System.out.println("size of stack is "+s.size());
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println("size of stack is "+s.size());
    }
}
