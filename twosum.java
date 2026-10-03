public class twosum {
    public static void main(String[] args) {
    //     int[] arr = {2,3,4,5,0,-2};
    // int x = 9;
    // int n = arr.length;
    // for(int i=0; i<=arr.length; i++){
    //     for(int j=i+1; j<arr.length; j++){
    //         if(arr[i] + arr[j] == x){
    //             System.out.println(arr[i]+" " +arr[j]);
    //         }
    //         }
    //     }

int[] arr = {10,20,30,40,50,60,70};
int n = arr.length;
for(int ele: arr){
    System.out.print(ele+ " ");
}
System.out.println();
// reverse
int i = 0, j = n-1;
while (i<=j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
}
for(int ele: arr){
    System.out.print(ele+ " ");
}
System.out.println();
    }
}
