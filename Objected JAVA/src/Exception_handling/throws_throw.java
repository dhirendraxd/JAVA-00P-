package Exception_handling;

class NegativeRadiusException extends Exception {
    public NegativeRadiusException(String message) {
        super(message);
    }
    @Override
    public String toString() {
        return public String nayamessage(){
            return "I am nayamessage()";
        }
    }
}

public class throws_throw {

    // so when we make any method that throws an exception we have to use the throws keyword in the method signature
    
    // when we call the fucntion of the class  that have that functio or methods then  we have to call it depending on the case of the methods if non static then  we have to create an object of the class and then call the method using the object of the class and if the method is static then we can call the method using the class name 


    // Non-static method
    public static double areaa(int r) throws NegativeRadiusException { 
        if (r < 0) {
            throw new NegativeRadiusException("Radius can't be negative");
        }
       else {
            double result = Math.PI * r * r;
            return result;
        }
        
    }

    // Non-static method
    int dividee(int a, int b) throws ArithmeticException {
        int c = a / b;
        return c;
    }

    // Static method
    static int divide(int a, int b) throws ArithmeticException {
        int c = a / b;
        return c;
    }

    public static void main(String[] args) {
        throws_throw obj = new throws_throw();

        // Using static method
        try {
            int nww = throws_throw.divide(6, 0); // Static method call
            System.out.println(nww);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception in static method: " + e.getMessage());
        }

        // Using non-static method
        try {
            int nw = obj.dividee(6, 0); // Non-static method call
            System.out.println(nw);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception in non-static method: " + e.getMessage());
        }



        // Using the non-static method that throws a custom exception
        try {


            double area = throws_throw.areaa(-5); // Static method call
            System.out.println("Area: " + area);


        } 

        catch (NegativeRadiusException e) {
            System.out.println("Negative radius exception: " + e.getMessage());



        }


    }
}
