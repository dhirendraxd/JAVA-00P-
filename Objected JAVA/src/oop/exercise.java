package oop;

import java.util.Scanner;

class Tommy{ // this is a clas
    public void hit(){ // void for ouput  // int or string for returning values 
        System.out.println("hitting the enemy");
        
    }
    public void run (){
        System.out.println("running ");
        
    }
    public void fire(){
        System.out.println("firing ");
    }
    ///////////////////////////////////////////////
//so first we take userinput and assign it to this below method and then it pass that value to a new variabls calle  name by user and returns it 
//.......................................................//
///        then the new methods getnamebyuser retunrs the name by user  , in case we might thnk why not using  setvalues it alos does the same but there a diffrence cause its a setter and getnamebyuser is a geter so we mostly use it   , we use it to only take input form user and then pass the value  given in form of a new variabl and the next getter will get it then it can retunr as its main work is to return value
/////////////////////////////////////////////
    private int namebyuser; // empty var
    public int setvalues(int input_name){ // the name shoudl be same for both parameter and inside var 
        namebyuser = input_name;
        return namebyuser;
        // setter method to set value after user sends the value and assigning it to a new varinside this and then applying it in a new getter method
    }

    public int getNameByUser() {
        return namebyuser; // Getter method to retrieve 'namebyuser' variable
    }
    // inpur form user 
// System.out.print("Enter a number for 'namebyuser': ");
// int userInput = sc.nextInt(); // Read user input as an integer
}

public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tommy playe1 = new Tommy(); 

// when workign with methods and class we have to assign a new  entity to be store inside that as tommy player1 is a new  object which will have its own properties that are inside of the class, basically it means that it can be a part of the class as a family and can use all the thigns inside of the class 

playe1.setvalues(23);
System.out.println("player 1 vlaues:"+playe1.getNameByUser());
Tommy playe11 = new Tommy();

// inpur form user 
System.out.print("Enter a number for 'namebyuser': ");

int value = sc.nextInt(); // Read user input as an integer

playe1.setvalues(value); // Set 'namebyuser' with user input
System.out.println("enter the value for chutmat:");
int chutmat = sc.nextInt();
playe11.setvalues(chutmat);
System.out.println("this is the entered data "+playe11.getNameByUser());


        playe1.fire();
        playe1.run();
        playe1.hit();
        sc.close();
    }
}


