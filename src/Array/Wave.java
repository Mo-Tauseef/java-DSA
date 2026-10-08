package Array;

public class Wave {
    static void main() {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        for(int i=0; i<n-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}
