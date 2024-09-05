package Exception_handling;

public class try_catch {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("ya message error ki wajah se aaya ha ");
            System.out.println("Error: " + e.getMessage());
            
        }
        System.out.println("End of the program");

    }    

}
