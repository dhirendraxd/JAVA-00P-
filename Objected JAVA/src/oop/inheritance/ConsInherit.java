package oop.inheritance;

// Base class
class Base {
    public int x;

    Base() {
        System.out.println("I am a constructor of Base");
    }
    Base(int x){
        System.out.println(" i am a construcot with a values of"+x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

// Derived class
class DerivedWala extends Base {
    public int y;
    DerivedWala() {
        super(0); // if the x parameter methods is not found then it will produce error
        System.out.println("I am a derived class constructor");
    }
    DerivedWala(int x ,int y){
        super(x); // now this will go up to the base methods and will call the methods having the parameter of x which is base(int x);
        System.out.println("i am an overloaded  having value of y "+y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class childofderiver extends DerivedWala(){
    childofderiver(){
        System.out.println("i am a chile of derived constr");
    }
    childofderiver(int x, int y, int z){
        super(x, y);
        System.out.println("i am an overloader of derived constr with the value of z "+z);
    }
}

public class ConsInherit {
    public static void main(String[] args) {
        // When creating instances, the constructor of the parent (Base) class will be executed first

        Base b = new Base();

        DerivedWala d = new DerivedWala();

        // case 0
         DerivedWala d = new DerivedWala(4,5);// now this will activate the constructor having two parameter and then in side the twon parameter method if there if an super in our case there it will envoke the method will the super varible inside it  in our ccase there is x so it will vall 

        // case 1
        childofderiver cd = new childofderiver(); 
        // output : i am a construc
        // i am a derived class construct
        // i am  a chile of derived construct


        // case 2
        childofderiver cd = new childofderiver(32, 432, 63);// same but with values 
        //output will now be as the values we store or entered  above as 32,432 and 63  
        // process first of all it will call the  method inside of the childofderiver  and if the childofderiver has any super key init then it will go there any before returning its value it will check if that methods which  we came cause previous has super name after it ,if this also has any super then it will go there and print and it goes  untill it end and returns values form top to bottom , print all the values it was asked to get  

        // so the output will be of the above entered num with each super key accessed and printed 

    }
}
