# Task 1
### Method Description:
This method that prompts the user to enter the size and elements of an integer array, and then uses the `findMin()` method to recursively find and display the minimum value of the array.
### Explanation:
The base case is when `n` is 1, in which case the method returns the first element of the array. Otherwise, the method recursively calls itself with `n-1` and compares the minimum value returned from the previous call with the `n-1` element of the array, returning the smaller value.
### Solution:
```
public static int findMin(int[] arr, int n) {
if (n == 1)
return arr[0];
else {
int min = findMin(arr, n - 1);
return Math.min(min, arr[n - 1]);
  }
} 
```
# Task 2
### Method Description:
This method that prompts the user to enter the length and elements of an integer array, and then uses the `calculateAverage()` method to recursively calculate and display the average value of the array.
### Explanation:
The base case is when `n` is 0, in which case the method returns 0.0. Otherwise, the method recursively calls itself with `n-1` and calculates the sum of the first `n-1` elements, then adds the `n-1` element to the sum and returns the average.
### Solution:
```
public static double calculateAverage(int[] numbers, int n) {
            if (n == 0) { // If the array is empty, return 0.0
                return 0.0;
            } else { // Otherwise, recursively call the method and calculate the average
                double sum = calculateAverage(numbers, n - 1) * (double)(n - 1);
                sum += (double)numbers[n - 1];
                return sum / (double)n;
            }
        }
```
# Task 3
### Method Description:
This method checks whether a given integer is prime or composite. It includes two methods:

`isPrime()` - this method takes an integer as input, and returns `true` if the integer is prime, and `false` otherwise.

`isPrimeRecursive()` - this is a private method used by the `isPrime()` method, and checks if a given integer is prime or not using recursion.
### Explanation:
`isPrime(int n)`: It first checks whether the input is less than or equal to 1. If it is, then the method returns `false` because by definition 1 and all numbers less than 1 are not prime. If the input is greater than 1, then it calls the `isPrimeRecursive()` method.

`isPrimeRecursive(int n, int divisor)`: It takes two parameters: the integer `n` that we want to check, and the `divisor` which starts from 2 and increments until `n - 1`. If `n` is divisible by any number between 2 and `n-1`, then it is composite and the method returns `false`. If `n` is not divisible by any of these numbers, then it is prime and the method returns `true`.
### Solution:
```
public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            } // end of if statement
            else { // start of else clause
                return isPrimeRecursive(n, 2);
            } // end of else clause
        }
```
```
        private static boolean isPrimeRecursive(int n, int divisor) {
            if (divisor == n) {
                return true;
            } else if (n % divisor == 0) {
                return false;
            } else {
                return isPrimeRecursive(n, divisor + 1);
            }
        }
```
# Task 4
### Method Description:
The task contains a method `factorial` which calculates the factorial of a non-negative integer using recursion. 
### Explanation:
The base case is when `n` is 0, in which case the method returns 1. Otherwise, the method recursively calls itself with `n-1` and multiplies the result by `n`.
### Solution:
```
    public static int factorial(int n) {
            if (n == 0) {  // base case: 0! = 1
                return 1;
            } else {  // recursive case: n! = n * (n-1)!
                return n * factorial(n-1); // call the factorial method with n-1 to calculate (n-1)!, and multiply it by n
            }
        }
```
# Task 5
### Method Description:
This program calculates the nth Fibonacci number using recursion.
### Explanation:
The `fibonacci` method has three cases:

the base case for when `n=0`, which returns 0,

the base case for when `n=1`, which returns 1,

and the recursive case for when `n>1`, which calculates the nth Fibonacci number as the sum of the (n-1)th and (n-2)th Fibonacci numbers by calling the `fibonacci` method recursively with `n-1` and `n-2` as arguments, respectively.
### Solution:
```
 public static int fibonacci(int n) {
            if (n == 0) {  // base case: F0 = 0
                return 0;
            } else if (n == 1) {  // base case: F1 = 1
                return 1;
            } else {  // recursive case: Fn = Fn-1 + Fn-2
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }
```
# Task 6
### Method Description:
This program prompts the user to enter a base and an exponent, then calculates the result of raising the base to the exponent using recursion.
### Explanation:
The `calculatePower` method is a recursive function that calculates the value of the base raised to the exponent. It has two parameters: the base number and the exponent. 

The method first checks if the exponent is zero, in which case it returns 1. Otherwise, it multiplies the base number by itself `(n-1)` times and returns the result.
### Solution:
```
 public static double calculatePower(double a, int n) {
        if (n == 0) { // base case: any number raised to 0 is 1
            return 1;
        } else { // multiply the base by itself (n-1) times
            double power = a * calculatePower(a, n - 1);
            return power;
        }
    }
```
# Task 7
### Method Description:
This program takes an input array from the user and prints it in reverse order using recursion. The program consists of two functions.
### Explanation:
`printArray(int[] arr, int n)`:
This function takes an integer array `arr` and its length `n` as input, and prints the array elements separated by spaces.

`printReverseArray(int[] arr, int n)`
This function is a recursive function that takes an integer array `arr` and its length `n` as input, and prints the array elements in reverse order. It first checks if the length of the array is 1, in which case it simply prints the single element. Otherwise, it prints the last element of the array and then calls itself recursively with the length of the array reduced by 1.
### Solution:
```
 public static void printArray(int[] arr, int n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
```
```
        public static void printReverseArray(int[] arr, int n) {
            if (n == 1) {
                System.out.print(arr[0] + " ");
            } else {
                System.out.print(arr[n-1] + " ");
                printReverseArray(arr, n-1);
            }
        }
```
# Task 8
### Method Description:
This program checks whether a given string consists only of digits or not using recursion. 
### Explanation:
The `isAllDigits` method is a recursive method that takes a string `s` as input and returns a boolean value. If the string is empty, the method returns `true`. Otherwise, the method checks the first character of the string using the `Character.isDigit method`. If the first character is a digit, the method calls itself recursively with the remaining string, and returns the result. If the first character is not a digit, the method returns `false`.
### Solution:
```
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
```
# Task 9
### Method Description:
This program calculates the binomial coefficient `Cn,k` using a recursive method. The binomial coefficient represents the number of ways to choose `k` items from a set of `n` items, without regard to the order in which they are chosen.
### Explanation:
The method uses recursion to calculate the binomial coefficient based on the following formula:

`Cn,k = Cn-1,k-1 + Cn-1,k`

The base case occurs when `k = 0` or `k = n`, in which case the binomial coefficient is 1.
### Solution:
```
 public static int calculateBinomialCoefficient(int n, int k) {
            if (k == 0 || k == n) {
                return 1;  // base case: Cn,0 = Cn,n = 1
            } else {
                int prev1 = calculateBinomialCoefficient(n-1, k-1);  // Cn-1,k-1
                int prev2 = calculateBinomialCoefficient(n-1, k);    // Cn-1,k
                return prev1 + prev2;  // recursive case: Cn,k = Cn-1,k-1 + Cn-1,k
            }
        }
```
# Task 10
### Method Description:
This program calculates the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm recursively.
### Explanation:
The `calculateGCD()` function takes two arguments: `a` and `b`, and returns their GCD. If `b` is zero, the function returns `a` (the base case). Otherwise, it recursively calls itself with arguments `(b, a % b)` until `b` is zero, at which point the function returns the value of `a` (the base case).
### Solution:
```
  public static int calculateGCD(int a, int b) {
            if (b == 0) {
                return a;  // base case: GCD(a, 0) = a
            } else {
                return calculateGCD(b, a % b);  // recursive case: GCD(a, b) = GCD(b, a % b)
            }
        }
```
