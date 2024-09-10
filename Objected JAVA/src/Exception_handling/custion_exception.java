package Exception_handling;

import java.util.Scanner;

class exceptionn extends Exception{
    @Override
    public String toString(){
        return "Custom exception";
    }
    @Override
    public String getMessage(){
        return  "I am getMessage()";
    }
    // @Override
    public String random(){
        return "I am random()";
    }
    // while making  an custom exceptio we have to override the toString() and getMessage() method and extend the real  Exception class
}
public class custion_exception {
    public static void main(String[] args) {
        //  int a = 7;
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();

         if(a<9){
           try  {
            throw new exceptionn();
            
           } catch (Exception e) {
            // shoudl be the first catch block to be executed 
            // this is hwo to call the methods of the custom exception
            System.out.println(e.getMessage());
            System.out.println(e.toString()); // output : Exception_handling.exceptionn: Custom exception
            e.getStackTrace(); // output : Exception in thread "main" Exception_handling.exceptionn: Custom exception

           }
         }
    }
}
