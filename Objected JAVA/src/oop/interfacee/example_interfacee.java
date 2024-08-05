package oop.interfacee;
// Define interfaces
interface Character {
    // any class implementing these interfaces shoudl have its functio defined  
    void attack();
}

interface Weapon { // while implementing this intercace class we must have to implement its methods compulsory
    void use();
    default void defended(){
        System.out.println("defending"); // this methods isnt neede to be overrideen or implemented in another class we can call it form here 
    }
}
    // for example a condition like : 

// interface Character {
//     void attack(); // Abstract method
// // predefined method should always be written as default 
//     default void defend() { // Default method with a body
//         System.out.println("The character defends with a shield.");
//     }
// }

// class Warrior implements Character {
//     public void attack() {
//         System.out.println("Warrior attacks with a sword.");
//     }

//     @Override
//     public void defend() { // Overriding the default method (no 'default' keyword)
//         System.out.println("Warrior defends with a heavy shield.");
//     }
// }





// Implement interfaces
class Warrior implements Character, Weapon {
    public void attack() {
        System.out.println("Warrior attacks with a sword.");
    }

    public void use() {
        System.out.println("Warrior uses a sword.");
    }
}

class Mage implements Character, Weapon {
    public void attack() {
        System.out.println("Mage attacks with a wand.");
    }

    public void use() {
        System.out.println("Mage uses a wand.");
    }
}

public class example_interfacee {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();

        warrior.attack(); // Output: Warrior attacks with a sword.
        mage.attack();    // Output: Mage attacks with a wand.
        mage.defended();
    }
}
