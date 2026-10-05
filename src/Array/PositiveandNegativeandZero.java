package Array;

public class PositiveandNegativeandZero {
    static void main() {
        int[] arr = {1,-2,0,0,-1,2,0,-4,4,0,2};
        int n = arr.length;
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>0) pos++;
            if(arr[i]<0) neg++;
            else zero++;
        }
        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);
    }
}
