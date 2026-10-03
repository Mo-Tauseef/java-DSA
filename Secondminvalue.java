public class Secondminvalue {
    public static void main(String[] args) {
        int[] arr = {10,5,1,8,2,3,0};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        int smin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < smin && arr[i] != min){
            smin = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(smin);
    }
}
