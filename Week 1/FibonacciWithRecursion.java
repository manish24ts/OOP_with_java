import java.lang.*;
import java.util.*;

class FibonacciWithRecursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series");
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        for (int i = 2; i <= n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
