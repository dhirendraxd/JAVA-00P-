package Questions;

public class palindromeornot {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
        // for numbers palindrome check we can do 
        int num = 121;
        int temp = num;
        int revnum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            revnum = revnum * 10 + rem;
            temp = temp / 10;
        }
        if (num == revnum) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
        
    }
}
