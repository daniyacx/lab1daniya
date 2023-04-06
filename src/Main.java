import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();

        // Create an array to store the user's numbers
        int[] numbers = new int[n];

        // Ask the user to enter n numbers and store them in the array
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
