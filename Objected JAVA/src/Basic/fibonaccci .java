public class fibonaccci  {


    // short form 
    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to get a different Fibonacci number
        System.out.println("Fibonacci number at position " + n + " (recursive) is: " + fibonacciRecursive(n));

        System.out.println("Fibonacci number at position " + n + " (iterative) is: " + fibonacciIterative(n));
    }
}

//easier methods for fibo and factorial 
static int fibo (int n){
    if (n==1||n==0) {
        return 1;

    }
    else{
        return fibo(n-1)+fibo(n-2); // for fibo count 
        return n*fibo(-1); // for recursion of factorial 
    }
}