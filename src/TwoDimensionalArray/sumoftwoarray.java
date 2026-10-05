package TwoDimensionalArray;

public class sumoftwoarray {
    static void main() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length;
        int mxsum = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            mxsum = Math.max(mxsum, sum);
        }
        System.out.println(mxsum);
    }
}
