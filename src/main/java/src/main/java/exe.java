package src.main.java;

import java.util.Scanner;

public class exe {
    public static void main(String[] args) {
        
        System.out.println("MARKS CRITERIA IS OUT OF 100");
        
        int total = 500;
        Scanner scanf = new Scanner(System.in);
// declaring an scanner with name scanf and with keyboard input 

// TAKING INTEGER INPUT FROM USER :
System.out.println("enter marks of sub 1 ");
int sub1 = scanf.nextInt();

        System.out.println("enter marks of sub 2 ");
        int sub2 = scanf.nextInt();
        
        System.out.println("enter marks of sub 3 ");
        int sub3 = scanf.nextInt();
        
        System.out.println("enter marks of sub 4 ");
        int sub4 = scanf.nextInt();
        
        System.out.println("enter marks of sub 5 ");
        int sub5 = scanf.nextInt();
        
        
        System.out.println("sub 1 " + sub1 + 
            ", sub2 " + sub2 + 
            ", sub3 " + sub3 + 
            ", sub4 " + sub4 + 
            ", sub5 " + sub5);
            // usig quotation is necessary in java even though we dont  put anythign to decorate inside it ...
            // Compute the sum
     int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        
        // Print the sum 
        System.out.println("Total marks: OUT OF 100 " + totalMarks);

        float percentage = ((float) totalMarks / total) * 100;
        System.out.println("Marks Percentage is: ");
        System.out.print(percentage);

        scanf.close(); // Close the scanner
    }
}
