import java.util.*;

public class StackDemo{

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Random num = new Random();

        for (int i = 0; i < 5; i++) {
            stack.push(num.nextInt(100));
        }

        System.out.println("Stack elements => " + stack);
        System.out.println("Top element is " + stack.peek());
        System.out.println("Removed element is " + stack.pop());
        System.out.println("Element 50 availability => " + stack.search(50));
        System.out.println("Stack is empty? -> " + stack.isEmpty());
    }
}
