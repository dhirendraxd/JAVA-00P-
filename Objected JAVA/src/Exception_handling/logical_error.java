package Exception_handling;

public class logical_error {
    // wap to print prime num till 10 and from 10 to 20
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " is prime");
            }
        }
        for (int i = 10; i <= 20; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " is prime");
            }
        }
    }
}
