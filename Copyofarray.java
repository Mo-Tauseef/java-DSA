import java.util.Arrays;

public class Copyofarray {
    public static void main(String[] args) {
        int[] arr = {30,50,60,12,35,25};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        // int[] num = arr;
        // num[0] = 90; 
        // // shallow copy
        // System.out.println(arr[0]);
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 70;
        System.out.println(arr[0]);
    }
}
