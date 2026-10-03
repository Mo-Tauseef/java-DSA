import java.util.Scanner;

public class outputofarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Array Size");
            int[] arr = new int[7];
            // input -> loop
            
            for (int i = 0; i<=6; i++) {
                arr[i] = sc.nextInt();
                
            }
            
                    // output -> loop
            for (int i = 0; i<=6; i++) {
                System.out.print(arr[i] + " ");
                
            }
        }
    }
}
