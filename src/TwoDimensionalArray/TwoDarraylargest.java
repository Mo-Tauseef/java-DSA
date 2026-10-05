package TwoDimensionalArray;

import java.util.Scanner;

public class TwoDarraylargest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int mx = Integer.MIN_VALUE;
        int m = arr.length;;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                mx = Math.max(mx,arr[i][j]);
            }
            System.out.print(mx);
        }
        System.out.println();


    }
}
