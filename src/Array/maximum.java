package Array;

public class maximum {
    static void main() {
        int[] arr = {13,34,44,5,76,54,33,54,345};
//        int max = arr[0];
//        int n = arr.length;
//        for(int i =0; i<arr.length; i++){
//            if(arr[i]>max) max= arr[i];
//        }
//        System.out.println(max);
        int min = arr[0];
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[0]) min = arr[i];
        }
        System.out.println(min);
    }

}
