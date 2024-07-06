package practise_qs;

class Dog {
    public void bark() {
        System.out.println("I am a dog and I bark");
    }

    public void gender() {
        System.out.println("I am a male dog");
    }
}

class DogNew extends Dog {
    @Override
    public void bark() {
        System.out.println("I am a new dog and I also bark");
    }

    @Override
    public void gender() {
        System.out.println("I am a female dog");
    }
}

public class Exeinher {
    public static void main(String[] args) {
        System.out.println("New exe");

        Dog b = new Dog(); // Polymorphism: Reference of Dog, object of DogNew
        b.bark(); // Output: "I am a new dog and I  bark"
        b.gender(); // Output: "I am a male dog"

        DogNew dog2 = new DogNew();
        dog2.bark(); // Output: "I am a new dog and I also bark"
        dog2.gender(); // Output: "I am a female dog"
    }
}
