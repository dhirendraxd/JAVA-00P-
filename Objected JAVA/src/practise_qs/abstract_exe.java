abstract class absemp {
    abstract void hala();  // Abstract method hala
    abstract void hallal(); // Abstract method hallal
}

class newpac extends absemp {
    @Override
    void hala() {
        System.out.println("hey how you doing ");
    }

    @Override
    void hallal() {
        System.out.println("hey how you doing ");
    }
}

public class abstract_exe {
    public static void main(String[] args) {
        absemp ala = new newpac();  // Polymorphism: absemp reference to a newpac object
        ala.hala();  // Call the hala method
    }
}
