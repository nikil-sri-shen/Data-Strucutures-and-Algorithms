import java.util.Scanner;

public class RotateAntiClockWise {
//    Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.
    void Solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter " + n*n + " elements:");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int tmp = 0;
        for (int i = 0; i <= n-2; i++){
            for(int j=i+1; j <= n-1; j++){
                tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
        int p1, p2;
        for(int i=0;i<n;i++){
            p1=0;
            p2=n-1;
            while(p1<p2) {
                tmp = arr[p1][i];
                arr[p1][i] = arr[p2][i];
                arr[p2][i] = tmp;
                p1++;
                p2--;
            }
        }
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " "); // Take input for each element
            }
            System.out.println();
        }
    }
//    First convert the matrix into Transpose then reverse the matrix between rows or columns according to direction to rotate.
}
