interface Animal {
    void sound(); // Abstract method
    void eat();   // Abstract method
}

class Doggy {
    void hack() {
        System.out.println("Doggy hacks.");
    }
}

class Dog extends Doggy implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats.");
    }

    @Override
    public void hack() {
        System.out.println("Dog hacks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls Dog's sound method
        dog.eat();   // Calls Dog's eat method
        dog.hack();  // Calls Dog's hack method inherited from Doggy
        
        // animal.hack();   // would have worked if it had in animal
        // Compilation error: 'hack()' is not defined in Animal
        // testing git hub account 
    }
}
