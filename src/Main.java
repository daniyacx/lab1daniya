import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1:
                Task1.task1_main();
                break;
            case 2:
                Task2.task2_main();
                break;
            case 3:
                Task3.task3_main();
                break;
            case 4:
                Task4.task4_main();
                break;
            case 5:
                Task5.task5_main();
                break;
            case 6:
                Task6.task6_main();
                break;
            case 7:
                Task7.task7_main();
                break;
            case 8:
                Task8.task8_main();
                break;
            case 9:
                Task9.task9_main();
                break;
            case 10:
                Task10.task10_main();
                break;
            default:
                System.out.println("WRONG NUMBER");
                break;

        }

    }

}
class Task1 {
    public static void task1_main() {

        Scanner scanner = new Scanner(System.in);

        // get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // get the elements of the array from the user
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // find the minimum value from the array
        int min = findMin(arr, size);

        // display the minimum value
        System.out.println("Minimum value from the array is: " + min);
    }

    /**
     * This method recursively finds the minimum value from an array
     * @param arr the array to search
     * @param n the number of elements in the array to search
     * @return the minimum value from the array
     */
    public static int findMin(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else {
            int min = findMin(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
}
class Task2{
        public static void task2_main() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the length of the array: ");
            int n = input.nextInt();
            int[] numbers = new int[n];
            System.out.println("Enter the " + n + " numbers: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = input.nextInt();
            }

            // Calculate the average of the numbers using recursion
            double average = calculateAverage(numbers, n);

            // Display the average to the user
            System.out.println("The average is: " + average);
        }

        /**
         * This method calculates the average of an array of numbers using recursion
         * @param numbers The array of numbers
         * @param n The length of the array
         * @return The average of the numbers
         */
        public static double calculateAverage(int[] numbers, int n) {
            if (n == 0) { // If the array is empty, return 0.0
                return 0.0;
            } else { // Otherwise, recursively call the method and calculate the average
                double sum = calculateAverage(numbers, n - 1) * (double)(n - 1);
                sum += (double)numbers[n - 1];
                return sum / (double)n;
            }
        }
    }
    class Task3{
        public static void task3_main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt(); // read user input as integer
            if (isPrime(n)) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is composite");
            }
        }

        /**
         * this method check if a given integer is prime or not
         * @param n the integer to check
         * @return true if the integer is prime, false otherwise
         */
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            } // end of if statement
            else { // start of else clause
                return isPrimeRecursive(n, 2);
            } // end of else clause
        }

        /**
         * checks if a given integer is prime or not
         * @param n the integer to check
         * @param divisor the current divisor being checked
         * @return true if the integer is prime, false otherwise
         */
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
class Task4{
        public static void task4_main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a non-negative integer: "); // prompt the user to enter a number
            int n = scanner.nextInt(); // read the user's input as an integer
            int result = factorial(n); // call the factorial method with n and store the result
            System.out.println(n + "! = " + result); // print the result
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
class Task5{
        public static void task5_main() {
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
class Task6 {
    public static void task6_main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base (a): ");
        double a = input.nextDouble();
        System.out.print("Enter the exponent (n): ");
        int n = input.nextInt();
        input.nextLine(); // consume the remaining newline character
        int result = (int) calculatePower(a, n);
        System.out.printf("%f to the power of %d is %d", a, n, result);
    }

    /**
     * @calculatePower method recursively calculates the value of the base raised to the exponent
     * @param a the base
     * @param n the exponent
     * @return the value of the base raised to the exponent
     */
    public static double calculatePower(double a, int n) {
        if (n == 0) { // base case: any number raised to 0 is 1
            return 1;
        } else { // multiply the base by itself (n-1) times
            double power = a * calculatePower(a, n - 1);
            return power;
        }
    }
}
class Task7{
    public static void task7_main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Print the original array
            System.out.println("The original:");
            printArray(arr, n);

            // Print the reversed array
            System.out.println("The reversed:");
            printReverseArray(arr, n);
        }
        public static void printArray(int[] arr, int n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        /**
         * Recursive function to print the array in reverse order
         * @param arr The array to be printed in reverse order
         * @param n The length of the array
         */
        public static void printReverseArray(int[] arr, int n) {
            if (n == 1) {
                System.out.print(arr[0] + " ");
            } else {
                System.out.print(arr[n-1] + " ");
                printReverseArray(arr, n-1);
            }
        }
    }
class Task8{
    public static void task8_main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String s = scanner.next();
            if (isAllDigits(s)) {
                System.out.println(s + " Yes ");
            } else {
                System.out.println(s + " No ");
            }
        }

        /**
         * Recursive function to check if a given string consists only of digits
         * @param s The string to be checked
         * @return true if the string consists only of digits, false otherwise
         */
        public static boolean isAllDigits(String s) {
            if (s.length() == 0) { // base case: if the string is empty, it consists only of digits
                return true;
            } else {
                char firstChar = s.charAt(0);
                if (Character.isDigit(firstChar)) {
                    // if the first character is a digit, check the remaining string
                    String remainingString = s.substring(1);
                    return isAllDigits(remainingString);
                } else {
                    // if the first character is not a digit, the string does not consist only of digits
                    return false;
                }
            }
        }
    }
class Task9{
     public static void task9_main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = scanner.nextInt();
            System.out.print("Enter k: ");
            int k = scanner.nextInt();
            scanner.close();

            int result = calculateBinomialCoefficient(n, k);
            System.out.println("Cn,k = " + result);
        }
    /**
     * This recursive method calculates the binomial coefficient Cn,k using the formula:
     * Cn,k = Cn-1,k-1 + Cn-1,k, with base case Cn,0 = Cn,n = 1
     * @param n the total number of items
     * @param k the number of items to choose
     * @return the binomial coefficient Cn,k
     */
        public static int calculateBinomialCoefficient(int n, int k) {
            if (k == 0 || k == n) {
                return 1;  // base case: Cn,0 = Cn,n = 1
            } else {
                int prev1 = calculateBinomialCoefficient(n-1, k-1);  // Cn-1,k-1
                int prev2 = calculateBinomialCoefficient(n-1, k);    // Cn-1,k
                return prev1 + prev2;  // recursive case: Cn,k = Cn-1,k-1 + Cn-1,k
            }
        }
    }
class Task10{
    public static void task10_main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            scanner.close();

            int gcd = calculateGCD(a, b);
            System.out.println("GCD(" + a + ", " + b + ") = " + gcd);
        }
    /**
     * Recursive function to calculate the GCD of two numbers using the Euclidean algorithm
     * @param a the first number
     * @param b the second number
     * @return the GCD of a and b
     */
        public static int calculateGCD(int a, int b) {
            if (b == 0) {
                return a;  // base case: GCD(a, 0) = a
            } else {
                return calculateGCD(b, a % b);  // recursive case: GCD(a, b) = GCD(b, a % b)
            }
        }
    }