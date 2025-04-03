import java.util.Scanner;

public class MaximumOnesRow {
    int lowerBound (int[] arr, int n, int x) {
        int low = 0, high = n-1, mid = 0, ans = n;
        while(low <= high){
            mid = (low+high) / 2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
    int Solution () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of Elements in row:");
        int n = scanner.nextInt(); // User inputs array size
        System.out.print("Enter no of Elements in columns:");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m]; // Create array of user-defined size

        System.out.println("Enter " + n*m + " elements:");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                arr[i][j] = scanner.nextInt(); // Take input for each element
            }
        }
        int cntMax = 0;
        int index = 0;
        for (int i = 0; i < n; i++){
            int cntOnes = m - lowerBound(arr[i], n, 1);
            if(cntOnes > cntMax){
                cntMax = cntOnes;
                index = i;
            }
        }
        return index + 1;
    }
}
