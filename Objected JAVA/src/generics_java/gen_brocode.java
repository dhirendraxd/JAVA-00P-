public class gen_brocode {
    public static void main(String[] args) {
        Integer[] iray = {1, 2, 3, 4};
        char[] cray = {'a', 'b', 'c', 'd'};

        printMe(iray);
        printMe(cray);


        }

        public static void printMe(Integer[] i) {
            for (Integer x : i) {

                System.out.printf("%s ", x);

            }

            System.out.println();
        
        }
        public static void printMe(char[] i) {
            for (char x : i) {

                System.out.printf("%s ", x);

            }

            System.out.println();
        
        }
    }

