
public class ArithmeticOperations{
    public static void main(String[] args) {
        // Declare variables
        int a = 10;
        int b = 5;
        
        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 15
        
        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: Difference: 5
        
        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: Product: 50
        
        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: Quotient: 2
        
        // Modulus (Remainder)
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 0

        // Bitwise Operators
        int x = 5; // Binary: 0101
        int y = 3; // Binary: 0011

        // Bitwise AND
        result = x & y; // Binary: 0001 (1 in decimal)
        System.out.println("Bitwise AND: " + result); // Output: Bitwise AND: 1

        // Bitwise OR
        result = x | y; // Binary: 0111 (7 in decimal)
        System.out.println("Bitwise OR: " + result); // Output: Bitwise OR: 7

        // Bitwise XOR
        result = x ^ y; // Binary: 0110 (6 in decimal)
        System.out.println("Bitwise XOR: " + result); // Output: Bitwise XOR: 6

        // Bitwise NOT
        result = ~x; // Binary: 11111010 (Two's complement representation in 8 bits, resulting in -6 in decimal)
        System.out.println("Bitwise NOT: " + result); // Output: Bitwise NOT: -6

        // Left Shift
        result = x << 1; // Binary: 1010 (10 in decimal)
        System.out.println("Left Shift: " + result); // Output: Left Shift: 10

        // Right Shift
        result = x >> 1; // Binary: 0010 (2 in decimal)
        System.out.println("Right Shift: " + result); // Output: Right Shift: 2

        // Logical Operators
        boolean bool1 = true;
        boolean bool2 = false;

        // Logical AND
        boolean andResult = bool1 && bool2;
        System.out.println("Logical AND: " + andResult); // Output: Logical AND: false

        // Logical OR
        boolean orResult = bool1 || bool2;
        System.out.println("Logical OR: " + orResult); // Output: Logical OR: true

        // Logical NOT
        boolean notResult = !bool1;
        System.out.println("Logical NOT: " + notResult); // Output: Logical NOT: false
    
    }

    }

