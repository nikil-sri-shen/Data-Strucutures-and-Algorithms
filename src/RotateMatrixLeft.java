import java.util.Scanner;

public class RotateMatrixLeft {
    void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n = scanner.nextInt();
        System.out.println("Enter no of cols");
        int m = scanner.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter no of time to rotate the matrix");
        int k = scanner.nextInt();
        int tmp = k;
        for(int i=0;i<n;i++){
            while(tmp>0){
                int f = mat[i][0];
                for(int j=1;j<=m-1;j++){
                    mat[i][j-1] = mat[i][j];
                }
                mat[i][m-1] = f;
                tmp--;
            }
            tmp = k;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
