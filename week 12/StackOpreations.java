import java.util.Stack;

class StackOperations {
    public static void stackPush(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println("Pushed element: " + i);
        }
    }

    public static void stackPop(Stack<Integer> stack) {
        System.out.println("Pop elements from stack:");
        while (!stack.isEmpty()) {
            Integer element = stack.pop();
            System.out.println("Popped element: " + element);
        }
    }

    public static void stackPeek(Stack<Integer> stack) {
        Integer element = stack.peek();
        System.out.println("Element on top of the stack: " + element);
    }

    public static void stackSearch(Stack<Integer> stack, int element) {
        int position = stack.search(element);
        if (position == -1) {
            System.out.println("Element not found in stack");
        } else {
            System.out.println("Element found at position: " + position);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 2);
        stackSearch(stack, 6);
        stackPop(stack);
    }
}
