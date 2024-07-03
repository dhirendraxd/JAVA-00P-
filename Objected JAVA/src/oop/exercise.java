package oop;

import java.util.Scanner;

class tommy{ // this is a clas
    int namebyuser;
    public void hit(){ // void for ouput  // int or string for returning values 
        System.out.println("hitting the enemy");

    }
    public void run (){
        System.out.println("running ");

    }
    public void fire(){
        System.out.println("firing ");
    }
    public int setvalues(int input_name){
        return namebyuser = input_name;
    }

    public int getNameByUser() {
        return namebyuser; // Getter method to retrieve 'namebyuser' variable
    }
    
}
public class exercise {
    public static void main(String[] args) {
        Scanner sc.new Scanner(system.in);
        tommy playe1 = new tommy(); 
// when workign with methods and class we have to assign a new  entity to be store inside that as tommy player1 is a new  object which will have its own properties that are inside of the class 

// basically it means that it can be a part of the class as a family and can use all the thigns inside of the class 
playe1.setvalues(23);


// inpur form user 
System.out.print("Enter a number for 'namebyuser': ");
int userInput = scanner.nextInt(); // Read user input as an integer

playe1.setvalues(userInput); // Set 'namebyuser' with user input


        playe1.fire();
        playe1.run();
        playe1.hit();
    }
}
