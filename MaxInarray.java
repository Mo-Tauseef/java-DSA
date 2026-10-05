public class MaxInarray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,55,45,65,47,87,98,89,};
        int n = arr.length;
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > mx) mx = arr[i];
        }
        System.out.println(mx);
    }
}
