class PowerFunction {
    public static void main(String[] args) {
        int a = 2; // base
        int n = 10; // exponent
        int result = power(a, n); // call the power function and store the result
        System.out.println(a + "^" + n + " = " + result);
    }

    /**
     * the power function using recursion
     * @param a the base
     * @param n the exponent
     * @return a^n
     */
    public static int power(int a, int n) {
        if (n == 0) { // base case: any number raised to the power of 0 is 1
            return 1;
        } else if (n % 2 == 0) { // if the exponent is even, reduce the problem size by half
            int temp = power(a, n/2);
            return temp * temp; // a^n = (a^(n/2))^2
        } else { // if the exponent is odd, reduce the problem size by one and multiply by a
            return a * power(a, n-1); // a^n = a^(n-1) * a
        }
    }
}

