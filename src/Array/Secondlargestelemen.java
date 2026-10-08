package Array;

public class Secondlargestelemen {
    static void main() {
        int[] arr = {2,3,4,5,6,7,9,3};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smx = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>smx && arr[i]!= max) smx = arr[i];
        }
        System.out.println(max);
        System.out.println(smx);
    }
}
