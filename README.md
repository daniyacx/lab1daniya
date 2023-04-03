# lab1daniya problem 2
this program calculates the average of an array of integers using recursion. 

public static void main(String[] args) {
 It takes an array of String arguments named args.

int[] numbers = {3, 2, 4, 1};
 This line declares and initializes an integer array named numbers with four elements.

double average = calculateAverage(numbers, numbers.length);
 This line calculates the average of the numbers array by calling the calculateAverage method and passing in the numbers array and its length as arguments.

System.out.println("The average is: " + average);
 This line prints the calculated average to the console.

if (n == 0)
    return 0;
 This line checks if the value of n is 0. If it is, the method returns 0 as the average.

else {
    double sum = calculateAverage(numbers, n - 1) * (n - 1);
    sum += numbers[n - 1];
    return sum / n;
}

If n is not 0, the method calls itself recursively with the n value decreased by 1. It then multiplies the returned value by (n - 1) and adds the n-1 element of the numbers array to the sum. 
Finally, it returns the sum divided by n as the average.
