public class logical {
public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;

    // Relational and logical operators in if statement
    if (num1 > 0 && num2 > 10) {
        System.out.println("Both conditions are true");
    }

    if (num1 == 0 || num2 == 0) {
        System.out.println("At least one condition is true");
    }

    if (!(num1 < 5)) {
        System.out.println("Logical NOT operator: num1 is not less than 5");
    }

    int a = 5;
int b = 10;

// Using relational operators
boolean isEqual = (a == b);     // false
boolean isNotEqual = (a != b);  // true
boolean isGreater = (a > b);    // false
boolean isLess = (a < b);       // true
boolean isGreaterOrEqual = (a >= b);  // false
boolean isLessOrEqual = (a <= b);     // true


boolean x = true;
boolean y = false;

// Using logical operators
boolean result1 = (x && y);   // false (true && false)
boolean result2 = (x || y);   // true (true || false)
boolean result3 = !x;         // false (!true)
boolean result4 = !y;         // true (!false)


}
}
