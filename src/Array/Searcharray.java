package Array;

public class Searcharray {
    static void main() {
        int[] arr = {1,2,4,6,7,8,45};
         int x = 7;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                System.out.println("found"+ i);
            }
            else{
                System.out.println("not found");
            }
        }
    }
}
