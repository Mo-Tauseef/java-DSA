package TwoDimensionalArray;

public class Spiral {
    static void main() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        int minr = 0, maxr = m-1, minc = 0, maxc = n-1;
        while (minr<=maxr && minc<=maxc){
//            // left to right
            for (int j = minc; j <=maxc ; j++) {
                System.out.println(arr[minr][j]);
            }minr++;
            //top to bottom
            if(minr>maxr || minc>maxc) break;
            for(int i=minr; i<=maxr;i++){
                System.out.println(arr[i][maxc]);
            }maxc--;
            //right to left
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc; j>=minc; j--){
                System.out.println(arr[maxr][j]);
            }maxr--;
//            bottom to top
            if(minr>maxr || minc>maxc) break;
            for (int i = maxr; i >=minr; i--) {
                System.out.println(arr[i][minc]);
            }minc++;

        }
    }
}
