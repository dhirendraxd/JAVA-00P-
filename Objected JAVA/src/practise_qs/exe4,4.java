package practise_qs;

class Rectangle {
    private int length;
    private int breadth;

    // Getter for length
    public int getLength() {
        return length;
    }

    // Getter for breadth
    public int getBreadth() {
        return breadth;
    }

    // Default constructor
    public Rectangle() {
        length = 43;
        breadth = 45;
    }

    // Parameterized constructor
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}

public class Exe4 {
    public static void main(String[] args) {
        System.out.println("");

        // Case 2: Using parameterized constructor
        Rectangle re = new Rectangle(32, 53);
        // Output for parameterized constructor
        System.out.println("Breadth: " + re.getBreadth()); // Output: 53
        System.out.println("Length: " + re.getLength());   // Output: 32
///////////////////
        // Case 1: Using default constructor
        Rectangle reDefault = new Rectangle();
        // Output for default constructor
        System.out.println("Breadth (default): " + reDefault.getBreadth()); // Output: 45
        System.out.println("Length (default): " + reDefault.getLength());   // Output: 43
    }
}
