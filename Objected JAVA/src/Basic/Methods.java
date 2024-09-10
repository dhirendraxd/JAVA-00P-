public class Methods {

    // Static method in Java
    static int logiic(int a, int b){
        if (a > b) {
            System.out.println("a is greater");
            return a;
        } else {
            System.out.println("b is greater");
            return b;
        }
    }

    // Non-static method in Java
    int copy_logic(int x, int y){
        if (x >= y) {
            System.out.println("x is greater");
            return x;
        } else {
            System.out.println("y is greater");
            return y;
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the Methods class
        Methods obj = new Methods();

        // // Calling the static method
        int b = logiic(10, 23); // we dont need to create an object for static method or we can use the class name to call the static method : int b = Methods.logiic(10, 23);
        System.out.println("Result: " + b);

        

        // Calling the non-static method using the object
        int result = obj.copy_logic(20, 15);
        System.out.println("Copy Logic Result: " + result);
    }
}
