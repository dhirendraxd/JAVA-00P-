public class methods2 {
    static void foo(){
        System.out.println("good morning dude");
    }
     
    static void foo(int a, int b){
        System.out.println("wassup"+a+"bro");
        System.out.println("hey this is for b and b's values is "+b+":");
    }
       
    static void foo(int a, int b){
        System.out.println("wassup"+a+"bro");
        System.out.println("hey this is for b and b's values is "+b+":");
        return 3;
    }
// method overloading cannnot be preformed by only changing the return type of methods 


 

    public static void main(String[] args) {
        foo();
        foo(3242, 53453);
    }
}
