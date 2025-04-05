import java.util.Scanner;

public class PrintMatrixDiagonally {
    void Solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter " + n*n + " elements:");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        boolean up = true;
        int i = 0,j = 0;
        while(count < n*n){
            if(up){
                while(i >= 0 && j < n){
                    System.out.print(mat[i][j]+" ");
                    count++;
                    if(j == n-1){
                        i++;
                        break;
                    }else if(i == 0){
                        j++;
                        break;
                    }
                    i--;
                    j++;
                }
                up^=true;
            }else{
                while(i < n && j>=0){
                    System.out.print(mat[i][j] + " ");
                    count++;
                    if(i == n-1){
                        j++;
                        break;
                    }else if(j == 0){
                        i++;
                        break;
                    }
                    i++;
                    j--;
                }
                up^=true;
            }
        }
        for (int a = 0; i < n; i++) {
            for(int b = 0; j < n; j++){
                System.out.print(mat[a][b] + " "); // Take input for each element
            }
            System.out.println();
        }
    }
}
