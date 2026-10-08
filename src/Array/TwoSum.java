package Array;

public class TwoSum {
    static void main() {
        int[] arr = {2,1,38,45,5,6,7};
        int target = 9;
        int n = arr.length;
        for(int i=0; i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}
