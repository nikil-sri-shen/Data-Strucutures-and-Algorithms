import java.util.Scanner;

public class RotateClockWise {
    void Solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter " + n*n + " elements:");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        int tmp = 0;
        for (int i = 0; i <= n-2; i++){
            for(int j=i+1; j <= n-1; j++){
                tmp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tmp;
            }
        }
        for(int i =0;i < n;i++){
            int p1 = 0;
            int p2 = n-1;
            while(p1<p2){
                tmp = mat[i][p1];
                mat[i][p1] = mat[i][p2];
                mat[i][p2] = tmp;
                p1++;
                p2--;
            }
        }
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " "); // Take input for each element
            }
            System.out.println();
        }
    }
}
