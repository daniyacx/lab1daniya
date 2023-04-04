/**
* a program that finds n-th elements in Fibonacci sequence using recursion
* we have two base cases that terminate the recursion when n is 0 or 1
* or we use the recursive definition of the Fibonacci sequence as Fn = Fn-1 + Fn-2
 * we can call it with any non-negative integer n, and it will recursively calculate the n-th element in the Fibonacci sequence.
 */
public class Main {
    public static void main(String[] args) {
        int n = 17;
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }

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


