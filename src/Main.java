import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
