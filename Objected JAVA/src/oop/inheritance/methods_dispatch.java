package oop.inheritance;
class phone {
    public void greet(){
        System.out.println("good morniing");
    }

    public void on(){
        System.out.println(" i am opening phone");
    }

}
class smartphone extends phone{
    public void swagat(){
        System.out.println("swagat ha ");
    }
    @Override
    public void on(){
        System.out.println("i am opening as a phone smartphone ");
    }
}
public class methods_dispatch {
    public static void main(String[] args) {
        // phone obj = new phone(); 
        // smartphone smobj = new smartphone();
        // obj.name(); //output :my name is java clss one 

        phone obj = new smartphone();
        obj.on();// output :i am opening as a phone smartphone 



    }
}
