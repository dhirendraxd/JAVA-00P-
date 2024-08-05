package oop.inheritance.abstractclass;



// Abstract class
abstract class Animal {
    public abstract void animalSound(); // Abstract method
    public void sleep() {
        System.out.println("Zzz"); // Regular method
    }
}

// Subclass (inherits from Animal)
class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}


public class abstract_example {
    public class Main {
        public static void main(String[] args) {
            Pig myPig = new Pig();
            myPig.animalSound(); // Output: The pig says: wee wee
            myPig.sleep(); // Output: Zzz
        }
    }
    
}
