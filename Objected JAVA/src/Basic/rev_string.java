package Basic;

public class rev_string {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original string: " + str);
        
        System.out.print("Reversed string: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}