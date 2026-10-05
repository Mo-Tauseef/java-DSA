package Array;

public class GreatestElement {
    static void main() {
        int[] arr = {8,42,41,37,60,49,40,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        int nge = arr[n-1];
//        hum ya pr 21 bhi likh sakte hai
        for(int i=n-2; i>=0; i--){
            ans[i] = nge;
            nge = Math.max(nge,arr[i]);
        }
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        for(int ele: ans){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
