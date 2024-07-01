public class Recursion {
    
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        if (n == 0) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial:");
        int n = 23;
        System.out.println("The factorial of " + n + " (recursive) is: " + factorial(n));
        System.out.println("The factorial of " + n + " (iterative) is: " + factorial_iterative(n));
    }
}



int sum facoti (int n ){
    if (n ==0) {
        return 1;
    }
    else{
        return n* factorial(n-1);
    }
}