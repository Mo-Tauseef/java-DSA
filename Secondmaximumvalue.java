public class Secondmaximumvalue {
    public static void main(String[] args) {
        int[] arr = {105,2500,30,55,45,65,47,87,5000,98,89,};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > smx && arr[i] != mx)
            smx = arr[i];
            
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
