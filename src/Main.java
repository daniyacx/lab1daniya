public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 4, 1};
        double average = calculateAverage(numbers, numbers.length);
        System.out.println("The average is: " + average);
    }

    public static double calculateAverage(int[] numbers, int n) {
        if (n == 0)
            return 0;
        else {
            double sum = calculateAverage(numbers, n - 1) * (n - 1);
            sum += numbers[n - 1];
            return sum / n;
        }
    }
}
