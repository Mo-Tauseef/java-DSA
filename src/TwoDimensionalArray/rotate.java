//package TwoDimensionalArray;
//
//public class rotate {
//    static void main() {
//        int[][] arr = {{0,1},{1,0}};
//        int[][] target = {{0,1},{1,0}};
//        int m = arr.length;
//        int n = arr[0].length;
//
//
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//        boolean flag = true;
//        for (int i = 0; i <m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(arr[i][j] != target[i][j]){
//                    return false;
//                }
//            }
//        }
//    }
//}
