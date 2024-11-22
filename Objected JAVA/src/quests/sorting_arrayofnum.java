public class sorting_arrayofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = sort(arr);
        System.out.println("The sorted array is: ");
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
