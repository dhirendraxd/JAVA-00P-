public class AssociativityDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        // Left Associativity
        int leftAssociativity = a + b - c; // if no any braces are made then its always left  by default
        
        // Grouping: (a + b) - c
        System.out.println("Left Associativity: " + leftAssociativity); // Output: Left Associativity: 13

        // Right Associativity
        int rightAssociativity = a - (b - c);
        // Grouping: a - (b - c)
        System.out.println("Right Associativity: " + rightAssociativity); // Output: Right Associativity: 7

        // Assignment Operator Associativity
        int x, y, z;
        x = y = z = 5;
        // Grouping: x = (y = (z = 5))
        System.out.println("Assignment Operator Associativity: x=" + x + ", y=" + y + ", z=" + z); // Output: Assignment Operator Associativity: x=5, y=5, z=5
    }

    @Override
    public String toString() {
        return "AssociativityDemo []";
    }
}
