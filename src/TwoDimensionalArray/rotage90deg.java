package TwoDimensionalArray;

public class rotage90deg {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int m = arr.length;
        int n = arr[0].length;

        // Step 1: Transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < m; i++) {

            int a = 0;
            int b = n - 1;

            while (a < b) {

                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;

                a++;
                b--;
            }
        }

        // Print array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}