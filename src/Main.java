/**
* a program that finds factorial "n" using recursion
* this recursive continues until we reach the base case of 0! = 1.
* or we use the recursive of n! as n * (n-1)!
 */
class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println(n + "! = " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {  // base case: 0! = 1
            return 1;
        } else {  // recursive case: n! = n * (n-1)!
            return n * factorial(n-1);
        }
    }
}

