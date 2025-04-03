import java.util.*;
import java.sql.Array;
//import java.util.Scanner;

public class TwoDimArray {
//    You are given an m x n integer matrix.
//    Matrix with the following two properties:
//    Each row is sorted in non-decreasing order.
//    The first integer of each row is greater than the last integer of the previous row.
//    Given an integer target, return true if target is in matrix or false otherwise.
//
//    You must write a solution in O(log(m * n)) time complexity.
    boolean searchTwoDimArray() {
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
        System.out.print("Enter the target element:");
        int target = scanner.nextInt();
        int low = 0, high = (n*m)-1;
        while(low <= high){
            int mid = (low + high)/2;
            int r = mid/m;
            int c = mid%m;
            if(arr[r][c]==target){
                return true;
            }else if (arr[r][c] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
    // We have done binary search on 2D array
}
