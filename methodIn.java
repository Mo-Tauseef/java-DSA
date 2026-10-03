import java.util.Arrays;

public class methodIn {
    public static void main(String[] args) {
        int[] arr = {30,50,60,12,35,25};
        //     
        
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        // for each loop
       Arrays.sort(arr); 
    //    assending oder ke liye hota hai
       System.out.println();
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
       }    
    }
}
