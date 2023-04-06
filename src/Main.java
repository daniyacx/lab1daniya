import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }

    /**
     * find the nth Fibonacci number using recursion
     * @param n the index of the desired Fibonacci number (0-based)
     * @return the value of the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n == 0) {  // base case: F0 = 0
            return 0;
        } else if (n == 1) {  // base case: F1 = 1
            return 1;
        } else {  // recursive case: Fn = Fn-1 + Fn-2
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
