package Array;

public class Reverse {
    static void main() {
        int[] arr = {3,4,5,6,7,8,5,4};
        int n = arr.length;
        int i = 0, j= n-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+ " ");
        }

    }
}
