public class Rollnumber {
    public static void main(String[] args) {
        int[] arr = {36,67,34,65,32,23,78,70,24};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]<35)
                System.out.print(i + " ");
        }
    }
}
