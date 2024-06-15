import java.util.Scanner;

public class stringmethods {
    public static void main(String[] args) {

        // we always store string values in String datat types
        // capital String : String

        String str = "Hello, World!"; //  A GLOBAL VARIBALE 

        // 1. length(): Returns the length of the string
        int length = str.length(); // length is 13
        System.out.println("Length: " + length);
        //tells the length of the  strings 
        // OUTPUT : 6


        // 2. charAt(int index): Returns the character at the specified index
        char ch = str.charAt(7); // 'W'
        System.out.println("Character at index 7: " + ch);
        //Gives you the character at a specific position in the string (index starts at 0).



        // 3. substring(int beginIndex): Returns a substring starting from beginIndex to the end
        String substr1 = str.substring(7); // "World!"
        System.out.println("Substring from index 7: " + substr1);
        


        // 4. substring(int beginIndex, int endIndex): Returns a substring from beginIndex to endIndex-1
        String substr2 = str.substring(7, 12); // "World"
        System.out.println("Substring from index 7 to 12: " + substr2);


        
        // 5. concat(String str): Concatenates the specified string to the end of the invoking string
        String concatStr = str.concat(" Welcome");
        System.out.println("Concatenated string: " + concatStr);
        



        // 6. equals(Object another): Compares this string to another object (case-sensitive)
        String str1 = "hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2); // false
        System.out.println("Are str1 and str2 equal? " + isEqual);
        




        // 7. equalsIgnoreCase(String another): Compares this string to another object, ignoring case differences
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // true
        System.out.println("Are str1 and str2 equal ignoring case? " + isEqualIgnoreCase);
        


        // 8. indexOf(String str): Returns the index within this string of the first occurrence of the specified substring
        int index = str.indexOf("World"); // 7
        System.out.println("Index of 'World': " + index);
        




        // 9. replace(char oldChar, char newChar): Returns a new string resulting from replacing all occurrences of oldChar with newChar
        String replacedStr = str.replace('o', 'a'); // "Hella, Warld!"
        System.out.println("Replaced string: " + replacedStr);
        


        // 10. toUpperCase(): Returns a string in uppercase
        String upperCaseStr = str.toUpperCase(); // "HELLO, WORLD!"
        System.out.println("Uppercase string: " + upperCaseStr);
        




        // 11. toLowerCase(): Returns a string in lowercase
        String lowerCaseStr = str.toLowerCase(); // "hello, world!"
        System.out.println("Lowercase string: " + lowerCaseStr);
        



        // 12. trim(): Returns a copy of the string with leading and trailing whitespace removed
        String strWithSpaces = "   Hello   ";
        String trimmedStr = strWithSpaces.trim(); // "Hello"
        System.out.println("Trimmed string: " + trimmedStr);
        





        // 13. startsWith(String prefix): Tests if the string starts with the specified prefix
        boolean startsWithHello = str.startsWith("Hello"); // true
        System.out.println("Does the string start with 'Hello'? " + startsWithHello);
        



        // 14. endsWith(String suffix): Tests if the string ends with the specified suffix 
        boolean endsWithWorld = str.endsWith("World!"); // true
        System.out.println("Does the string end with 'World!'? " + endsWithWorld);
        



        // 15. isEmpty(): Returns true if the string length is 0
        String emptyStr = "";
        boolean isEmpty = emptyStr.isEmpty(); // true
        System.out.println("Is the string empty? " + isEmpty);
    }
}

