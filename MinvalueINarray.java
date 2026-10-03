public class MinvalueINarray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,55,45,65,47,8,87,98,89,};
        int n = arr.length;
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}
