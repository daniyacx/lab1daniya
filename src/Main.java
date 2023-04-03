import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is composite");
        }
        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } // End of if statement
        else { // Start of else clause
            return isPrimeRecursive(n, 2);
        } // End of else clause
    }

    private static boolean isPrimeRecursive(int n, int divisor) {
        if (divisor == n) {
            return true;
        } else if (n % divisor == 0) {
            return false;
        } else {
            return isPrimeRecursive(n, divisor + 1);
        }
    }
}
