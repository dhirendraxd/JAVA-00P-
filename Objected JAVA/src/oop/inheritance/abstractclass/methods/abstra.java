package oop.inheritance.abstractclass.methods;

// Abstract class parentt
abstract class parentt {
    public parentt() {
        System.out.println("I am a constructor of the parentt class");
    }

    public void sayhalo() {
        System.out.println("halo");
    }

    abstract public void grt(); // Abstract method
}

// Concrete subclass childt
class childt extends parentt {
    @Override
    public void grt() {
        System.out.println("Greetings from childt class!");
    }
}

public class abstra {
    public static void main(String[] args) {
        parentt p = new childt(); // Instantiate the child class
        p.sayhalo(); // Call the method from the parent class
        p.grt(); // Call the implemented abstract method
    }
}
