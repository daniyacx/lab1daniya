import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: "); // Prompt the user to enter a number
        int n = scanner.nextInt(); // Read the user's input as an integer
        int result = factorial(n); // Call the factorial method with n and store the result
        System.out.println(n + "! = " + result); // Print the result
    }

    /**
     * This method calculates the factorial of a given non-negative integer using recursion
     * @param n the integer whose factorial is to be calculated
     * @return the factorial of n
     */
    public static int factorial(int n) {
        if (n == 0) {  // base case: 0! = 1
            return 1;
        } else {  // recursive case: n! = n * (n-1)!
            return n * factorial(n-1); // call the factorial method with n-1 to calculate (n-1)!, and multiply it by n
        }
    }
}