package Exception_handling;

// Class definition
public class MethodsQuest {

    // Private method
    private String privateMethod() {
        return "This is a private method";
    }

    // Public method that calls the private method and returns its result
    public String publicMethod() {
        // Call the private method and return its result
        return privateMethod();
    }

    public static void main(String[] args) {
        // Create an instance of the MethodsQuest class
        MethodsQuest obj = new MethodsQuest();

        // Call the public method which internally calls the private method
        System.out.println(obj.publicMethod()); // Prints: This is a private method
    }
}
