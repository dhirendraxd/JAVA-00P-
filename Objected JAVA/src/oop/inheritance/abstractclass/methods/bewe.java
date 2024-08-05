package oop.inheritance.abstractclass.methods;

// while making an abstract method inside a classs the class should also be abstract as well .. 
  abstract class  base { // parent class is also declared abstract to solve the issue for abstract function below 
    public base(){
        System.out.println("mai base 2 ka constructor hu ");
    }
    public void sayhelloo(){
        System.out.println("hello how you doing");
    }
    abstract public void gret(); // shile making an abstract class we have to name the upper parent class abstract too either it will show errors
    abstract public void gret2();
}

class childd extends base{
    @Override
    public void gret(){
        System.out.println("hello boi");
    }
    @Override
    public void gret2(){
        System.out.println("hey ");

    }
}
class childd3 extends base{
    public void th(){
        System.out.println("hey i am goood ");
    }
}
public class bewe {
    public static void main(String[] args) {
     base b = new base(); // abstract classs wont be able to make object we can  inherit through them  only .
     childd3 c3 = new childd3();
     childd cd = new childd();   
     System.out.println();
     cd.gret();
    }
}

// why make abstract class :
/*
 * Abstract classes are useful when you want to define a common interface for all subclasses
 * while still providing some shared implementation. They allow you to enforce certain
 * behavior in all subclasses, ensuring that key methods are implemented consistently.
 * For example, in a GUI framework, you might have an abstract class "Shape" with an 
 * abstract method "draw()". Every shape, like a circle or a rectangle, must implement 
 * the "draw()" method, but the base class can provide shared methods like "move()" 
 * or "resize()".
 



 */