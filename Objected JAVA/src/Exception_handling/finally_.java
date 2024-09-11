package Exception_handling;

public class finally_ {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println(e.getMessage());
        }
        finally { // finally block will always execute even if there is an exception or not 
            System.out.println("This is finally block");
            // we can do follwoing things in finally block : 
            // 1. close the resources like file, network connection, database connection
            // 2. clean up the code
            // 3. execute some code that should run after a block of code
            

        }


    }
    
}
