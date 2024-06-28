public class multidim_arrays {
    public static void main(String[] args) {
        int[][] room = new int[2][3];
        room[0][0] = 101;
        room[0][1] = 102;
        room[0][2] = 103; // Assign a value to the third element of the first row
        room[1][0] = 201; // Assign values to the second row as well
        room[1][1] = 202;
        room[1][2] = 203;

        // printing 2D array
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                System.out.print(room[i][j] + " ");
            }
            System.out.println();
        }
    }
}
