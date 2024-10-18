package string_builder;

import java.util.Scanner;

public class bulde {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // char at index 1
        System.out.println(sb.charAt(1));

        //clear at index 2
        sb.deleteCharAt(2);

        // append at the end
        sb.append(" World");
        System.out.println(sb);

        // append at index 5
        sb.append(" Java", 5, 9);
        System.out.println(sb); // output will be "Hello World Java"

        // delete from index 5 to 9
        sb.delete(5, 9);
        System.out.println(sb); // output will be "Hello Java"
        // deletign whole string
        sb.delete(0, sb.length());
        System.out.println(sb); // output will be an empty string

        // insert at the end
        sb.insert(sb.length(), " World");
        System.out.println(sb);

        // use of .length() method
        System.out.println(sb.length());
        // using .length() method to insert at the end
        sb.insert(sb.length(), " Java");
        System.out.println(sb);

        // using length method in for loop and others 
        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }
        System.out.println();
        // ouput will be " World Java" as the string is "Hello World Java" because of the previous insertions and deletions performed on the string
        

        // insert at index 5
        sb.insert(5, " Java");
        System.out.println(sb);

        // replace at index 5 to 9
        sb.replace(5, 9, " C++");
        System.out.println(sb);

        // reverse the string
        sb.reverse();
        System.out.println(sb);
         

        // storing user input in a string builder and reversing it 
        System.out.println("Enter a string to reverse: ");
        Scanner sc = new Scanner(System.in);
        String stor = sc.nextLine();
        StringBuilder sb2 = new StringBuilder(stor);
        sb2.reverse();
        System.out.println(sb2); // ouput will be the reverse of the input string

    }
}
