public class Varargs {

    // Method using varargs to sum multiple integers
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    // Overloaded method using varargs with a compulsory first integer parameter
    static int sumWithCompulsoryFirst(int x, int... arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial:");
        System.out.println("The result of summing 23, 43, 534, 534, 523, 5236, 7 is " + sum(23, 43, 534, 534, 523, 5236, 7));
        System.out.println("The result of an empty sum is " + sum()); // Output will be 0 as an empty arguments function will return 0
        System.out.println("The result of summing 33, 43, 534, 53, 4, 53, 4, 53, 5 is " + sumWithCompulsoryFirst(33, 43, 534, 53, 4, 53, 4, 53, 5));
    }
}
