public class TestStackSinglyList {
    public static void main(String[] args) {
        LinkedStack<Integer> l = new LinkedStack<>();
        l.push(3);
        l.push(2);
        System.out.println(l.top());
    }
}
